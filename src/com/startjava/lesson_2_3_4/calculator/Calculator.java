package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    private double a;
    private char sign;
    private double b;
    private double result;

    public void startCalculation() {
        Scanner scanner = new Scanner(System.in);
        String yesNo = "yes";
        while (yesNo.equals("yes")) {
            System.out.print("Enter separated by a space: first number, mathematical symbol, second number: ");
            String[] mathExpression = scanner.nextLine().split(" ");
            a = Double.parseDouble(mathExpression[0]);
            sign = mathExpression[1].charAt(0);
            b = Double.parseDouble(mathExpression[2]);
            calculate();
            System.out.print("Would you like to continue? Type in [yes/no]: ");
            yesNo = scanner.nextLine();

            while (!yesNo.equals("no") && !yesNo.equals("yes") ) {
                System.out.println("Do write down yes or no !!!");
                yesNo = scanner.nextLine();
            }
        }
    }

    private void calculate() {
        switch (sign) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            case '^' -> result = Math.pow(a, b);
            case '%' -> result = a % b;
            default -> {
                System.out.println("Error: the sign " + sign + " is not supported");
                return;
            }
        }
        printResult();
    }

    private void printResult() {
        if (result % 1 == 0) {
            System.out.printf((int) a + " " + sign + " " + (int) b + " = %.0f \n", result);
        } else {
            System.out.printf((int) a + " " + sign + " " + (int) b + " = %.3f \n", result);
        }
    }
}