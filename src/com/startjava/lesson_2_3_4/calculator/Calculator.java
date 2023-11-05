package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) throws RuntimeException {
        String[] elements = mathExpression.split(" ");
        char sign;
        double a;
        double b;

        if (elements.length != 3) {
            throw new RuntimeException("The length of inputting math expression has not necessary size");
        }

        a = Double.parseDouble(elements[0]);
        sign = elements[1].charAt(0);
        b = Double.parseDouble(elements[2]);

        Calculator calculator = new Calculator();
        calculator.checkNums(a, b);

        return switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> {
                System.out.println("Error the sigh " + "'" + sign + "'" + " not supported");
                yield Double.MIN_VALUE;
            }
        };
    }

    private void checkNums(double a, double b) {
        if ((a < 0) || (b < 0)) {
            throw new RuntimeException("Inserted figures aren't positive numbers");
        } else if ((a % 1 != 0) || (b % 1 != 0)) {
            throw new RuntimeException("Inserted figures aren't integers");
        }
    }
}