package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                System.out.print("Enter separated by a space: first number, mathematical symbol, second number: ");
                String mathExpression = scanner.nextLine();
                double result = Calculator.calculate(mathExpression);
                print(result, mathExpression);
            }

            System.out.print("Would you like to continue? Type in [yes/no]: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    }

    private static void print(double result, String mathExpression) {
        if (result != Double.MIN_VALUE) {
            System.out.println((result % 1 == 0) ? mathExpression + " = " + (int) result :
                    mathExpression + " = " + String.format("%.3f", result));
        }
    }
}