package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String yesNo = "yes";
        while (yesNo.equals("yes")) {
            System.out.println("Enter separated by a space: first number, mathematical symbol, second number");
            String[] mathExpression = scanner.nextLine().split(" ");
            calculator.setA(Double.parseDouble(mathExpression[0]));
            calculator.setSign(mathExpression[1].charAt(0));
            calculator.setB(Double.parseDouble(mathExpression[2]));
            calculator.calculate();
            System.out.println("Would you like to continue type in yes or no ?");
            yesNo = scanner.nextLine();

            if (!yesNo.equals("no")) {
                System.out.println("Do write down yes or no !!!");
                yesNo = scanner.nextLine();
            }
        }
    }
}