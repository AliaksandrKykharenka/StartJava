package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String yesNo = "yes";
        while (yesNo.equals("yes")) {
            System.out.println("Type in the first number");
            calculator.setA(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Type in the math sigh");
            calculator.setSign(scanner.nextLine().charAt(0));

            System.out.println("Type in the second number");
            calculator.setB(scanner.nextInt());
            scanner.nextLine();

            calculator.calculate();

            System.out.println("Would you like to continue type in yes or no ?");
            yesNo = scanner.nextLine();
            while (!yesNo.equals("yes") && !yesNo.equals("no")) {
                System.out.println("Do write down yes or no !!!");
                yesNo = scanner.nextLine();
            }
        }
    }
}