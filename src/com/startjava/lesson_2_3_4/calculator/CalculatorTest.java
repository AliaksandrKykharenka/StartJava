package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.print("Enter separated by a space: first number, mathematical symbol, second number: ");
                String mathExpression = scanner.nextLine();
                double solution = calculator.calculate(mathExpression);
                if (solution != Double.MIN_VALUE) {
                    calculatorTest.print(solution, mathExpression);
                }
            }
            System.out.print("Would you like to continue? Type in [yes/no]: ");
            answer = scanner.nextLine();
        }
        while (!"no".equals(answer));
    }

    private void print(double solution, String mathExpression) {
        if (solution % 1 == 0) {
            System.out.printf(mathExpression + " = %.0f \n", solution);
        } else {
            System.out.printf(mathExpression + " = %.3f \n", solution);
        }
    }
}