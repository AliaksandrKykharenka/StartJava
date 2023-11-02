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
        int hiddenNum = (int) (Math.random() * 5) + 1;
        while (true) {
            System.out.print(pl1.getName() + " guess the number : ");
            pl1.setNum(scanner.nextInt());

            if (pl1.getCounter() == 5) {
                System.out.print("The player " + pl1.getName() + " has run out of attempts");
                break;
            }

            if (pl1.getInteger() < hiddenNum) {
                System.out.println("The number less than computer guessed");
            } else if (pl1.getInteger() > hiddenNum) {
                System.out.println("The number more than computer guessed");
            } else {
                System.out.print("Player " + pl1.getName() + " win with " +
                        pl1.getCounter() + " attempts");
                break;
            }


            System.out.print(pl2.getName() + " guess the number : ");
            pl2.setNum(scanner.nextInt());

            if (pl2.getCounter() == 5) {
                System.out.print("The player " + pl2.getName() + " has run out of attempts");
                break;
            }

            if (pl2.getInteger() < hiddenNum) {
                System.out.println("The number less than computer guessed");
            } else if (pl2.getInteger() > hiddenNum) {
                System.out.println("The number more than computer guessed");
            } else {
                System.out.print("Player " + pl2.getName() + " win with " +
                        pl2.getCounter() + " attempts");
                break;
            }
        }


        if (pl1.getCounter() > 0) {
            System.out.print("\nPlayer: " + pl1.getName() + " entered for the next numbers: ");
            pl1.printAttempts();
        }
        Arrays.fill(pl1.getNum(), 0, pl1.getCounter(), 0);
        pl1.setCounter(0);


        if (pl2.getCounter() > 0) {
            System.out.print("\nPlayer: " + pl2.getName() + " entered for the next numbers: ");
            pl2.printAttempts();
        }
        Arrays.fill(pl2.getNum(), 0, pl2.getCounter(), 0);
        pl2.setCounter(0);
    }



}