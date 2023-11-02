package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessNum = new GuessNumber("Vasily", "Nicolay");
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                guessNum.start();
            }
                System.out.println("\nWould you like to continue type in yes or no ?");
                answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}