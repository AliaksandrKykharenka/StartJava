package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.print("Enter separated by a space: first number, mathematical symbol, second number: ");
                String mathExpression = scanner.nextLine();

                double solution = calculator.calculate(mathExpression);
                if ((solution % 1 == 0) && (solution != Double.MIN_VALUE)) {
                    System.out.printf(mathExpression + " = %.0f \n", solution);
                } else if ((solution % 1 != 0) && (solution != Double.MIN_VALUE)) {
                    System.out.printf(mathExpression + " = %.3f \n", solution);
                }

            }
            System.out.print("Would you like to continue? Type in [yes/no]: ");
            answer = scanner.nextLine();
        }
        while (!"no".equals(answer));
    }
}