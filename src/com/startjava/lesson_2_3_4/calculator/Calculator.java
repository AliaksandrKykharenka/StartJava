package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    static char sign;

    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");

        double a = 0;
        double b = 0;
        if (elements.length != 3) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println("The length of inputting math expression has not necessary size");
                return Double.MIN_VALUE;
            }
        } else {
            a = Double.parseDouble(elements[0]);
            sign = elements[1].charAt(0);
            b = Double.parseDouble(elements[2]);
        }

        if ((a < 0) || (b < 0)) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println("Inserted figures aren't positive numbers");
                return Double.MIN_VALUE;
            }
        }

        if ((a % 1 != 0) || (b % 1 != 0)) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println("Inserted figures aren't integers");
                return Double.MIN_VALUE;
            }
        }

        return switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> {
                System.out.println("Error the sigh " + "'" + Calculator.sign + "'" + " not supported");
                yield Double.MIN_VALUE;
            }
        };
    }
}