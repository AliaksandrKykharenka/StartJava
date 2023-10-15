package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int hiddenNum = (int) (Math.random() * 100) + 1;
        while (true) {
            System.out.println(player1.getName() + " guess the number");
            player1.setNum(scanner.nextInt());
            if (player1.getNum() < hiddenNum) {
                System.out.println("The number less than computer guessed");
            } else if (player1.getNum() > hiddenNum) {
                System.out.println("The number more than computer guessed");
            } else {
                System.out.println(player1.getName() + " winner");
                break;

            }
            System.out.println(player2.getName() + " guess the number");
            player2.setNum(scanner.nextInt());
            if (player2.getNum() < hiddenNum) {
                System.out.println("The number less than computer guessed");
            } else if (player2.getNum() > hiddenNum) {
                System.out.println("The number more than computer guessed");
            } else {
                System.out.println(player2.getName() + " winner");
                break;
            }
        }
    }
}