package com.startjava.lesson_1.base;

public class GuessNumberGame {
    public static void main(String[] args) {
        int secretNum = 15;
        int playerNum = 50;
        while (playerNum != secretNum) {
            if (playerNum > secretNum) {
                System.out.println("The number is greater than the computer guessed");
                playerNum /= 2;
            } else {
                System.out.println("The number is less than the computer guessed");
                playerNum++;
            }
        }
        System.out.println("You are winner, good job bro");
    }
}