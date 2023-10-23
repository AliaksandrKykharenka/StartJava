package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while ("yes".equals(answer)) {
            System.out.print("Enter separated by a space: first number, mathematical symbol, second number: ");
            String mathExpression = scanner.nextLine();
            calculator.calculate(mathExpression);

            if (calculator.getResult() % 1 == 0 ) {
                System.out.printf((int) calculator.getA() + " " + calculator.getSign() + " " +
                        (int) calculator.getB() + " = %.0f \n", calculator.getResult());
            } else {
                System.out.printf((int) calculator.getA() + " " + calculator.getSign() + " " +
                        (int) calculator.getB() + " = %.3f \n", calculator.getResult());
            }

            System.out.print("Would you like to continue? Type in [yes/no]: ");
            answer = scanner.nextLine();
            while (!"yes".equals(answer) && !"no".equals(answer)) {
                System.out.println("Do write down [yes/no]: ");
                answer = scanner.nextLine();
            }
        }
    }
}