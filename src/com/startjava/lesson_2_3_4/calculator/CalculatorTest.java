package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String yesNo = "yes";
        while (true) {
            if (yesNo.equals("yes")) {
                System.out.print("Enter separated by a space: first number, mathematical symbol, second number: ");
                String inputMathExpression = scanner.nextLine();
                calculator.calculate(inputMathExpression);
                System.out.print("Would you like to continue? Type in [yes/no]: ");
                yesNo = scanner.nextLine();
            } else if (yesNo.equals("no")) {
                break;
            } else {
                System.out.println("Do write down yes or no !!!");
                yesNo = scanner.nextLine();
            }
        }
    }
}