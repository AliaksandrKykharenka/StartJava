package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

//    public GuessNumber(Player player1, Player player2) {
//        this.player1 = player1;
//        this.player2 = player2;
//    }

    public GuessNumber(String name1, String name2) {
     this.player1 = new Player(name1);
      this.player2 = new Player(name2);
        //
        //System.out.println( player1.getName()+"\n"+player2.getName());
    }
// for current work delete after...

    @Override
    public String toString() {
        return "GuessNumber{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                '}';
    }

    public void start() {
        // made

        System.out.println("The game has started! Each player has 10 attempts only");
        Scanner scanner = new Scanner(System.in);
        int hiddenNum = (int) (Math.random() * 100) + 1;
        while (true) {
            System.out.print(player1.getName() + " guess the number: ");
            player1.setNum(scanner.nextInt());
            System.out.println(player1.getCounter() + " " + player1.getNumInt());
            if (player1.getNumInt() < hiddenNum) {
                System.out.println("The number less than computer guessed");
            } else if (player1.getNumInt() > hiddenNum) {
                System.out.println("The number more than computer guessed");
            } else {
                // made
                System.out.println("Player " + player1.getName() + " guessed the number with " +
                        player1.getCounter() + " attempt");
                break;

            }
            System.out.println(player2.getName() + " guess the number");
            player2.setNum(scanner.nextInt());
            System.out.println(player2.getCounter() + " " + player2.getNumInt());
            if (player2.getNumInt() < hiddenNum) {
                System.out.println("The number less than computer guessed");
            } else if (player2.getNumInt() > hiddenNum) {
                System.out.println("The number more than computer guessed");
            } else {
                System.out.println("Player " + player2.getName() + " guessed the number with " +
                        player2.getCounter() + " attempt");
                break;
            }
        }

    }
}