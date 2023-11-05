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

                double result;
                try {
                    result = Calculator.calculate(mathExpression);
                    print(result, mathExpression);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.print("Would you like to continue? Type in [yes/no]: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    }

    private static void print(double result, String mathExpression) {
        if (result != Double.MIN_VALUE) {
            System.out.println(mathExpression + ((result % 1 == 0) ? " = " + (int) result :
                    " = " + String.format("%.3f", result)));
        }
    }
}