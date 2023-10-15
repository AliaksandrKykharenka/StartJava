package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fist player type in your name");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Second player type in your name");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber guessNum = new GuessNumber(player1, player2);

        String yesNo = "yes";
        while (yesNo.equals("yes")) {
            guessNum.start();
            System.out.println("Would you like to continue type in yes or no ?");
            yesNo = scanner.nextLine();

            while (!yesNo.equals("yes") && !yesNo.equals("no")) {
                System.out.println("Do write down yes or no !!!");
                yesNo = scanner.nextLine();
            }
        }
    }
}