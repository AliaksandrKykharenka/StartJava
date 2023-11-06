package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player pl1;
    private Player pl2;

    public GuessNumber(String name1, String name2) {
        this.pl1 = new Player(name1);
        this.pl2 = new Player(name2);
    }

    public void start() {
        System.out.println("The game has started! Each player has 10 attempts only");
        Scanner scanner = new Scanner(System.in);
        int hiddenNum = (int) (Math.random() * 100) + 1;
        while (true) {
            if (method(scanner, hiddenNum, pl1, pl2)) break;
            if (method(scanner, hiddenNum, pl2, pl1)) break;
        }

        if (pl1.getAttempt() > 0) {
            printAttempts(pl1);
        }
        pl1.setAttempt(0);

        if (pl2.getAttempt() > 0) {
            printAttempts(pl2);
        }
        pl2.setAttempt(0);
    }

    private boolean method(Scanner scanner, int hiddenNum, Player pl1, Player pl2) {
        System.out.print(pl1.getName() + " guess the number : ");
        pl1.setNums(scanner.nextInt());

        if ((pl1.getAttempt()) == 10 && (pl2.getAttempt() == 10)) {
            System.out.print("The player " + pl1.getName() + " has run out of attempts");
            return true;
        }

        if (pl1.getNum() < hiddenNum) {
            System.out.println("The number less than computer guessed");
        } else if (pl1.getNum() > hiddenNum) {
            System.out.println("The number more than computer guessed");
        } else {
            System.out.print("Player " + pl1.getName() + " win with " +
                    pl1.getAttempt() + " attempt");
            return true;
        }
        return false;
    }

    public void printAttempts(Player pl) {
        System.out.print("\nPlayer: " + pl.getName() + " entered for the next numbers: ");

        for (int num : Arrays.copyOf(pl.getNums(), pl.getAttempt())) {
            System.out.print(num + " ");
        }
        Arrays.fill(pl.getNums(), 0, pl.getAttempt(), 0);
    }
}