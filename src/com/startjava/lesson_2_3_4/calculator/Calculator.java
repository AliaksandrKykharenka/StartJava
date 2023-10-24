package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private double a;
    private char sign;
    private double b;
    private double result = Double.MIN_VALUE;

    public double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        a = Double.parseDouble(elements[0]);
        sign = elements[1].charAt(0);
        b = Double.parseDouble(elements[2]);
        switch (sign) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            case '^' -> result = Math.pow(a, b);
            case '%' -> result = a % b;
            default -> System.out.println("Error the sign: " + "'" + sign + "'" + " is not supported");
        }
        return result;
    }

    public void print() {
        if ((result % 1 == 0) && (result != Double.MIN_VALUE)) {
            System.out.printf((int) a + " " + sign + " " + (int) b + " = %.0f \n", result);
        } else if ((result % 1 != 0) && (result != Double.MIN_VALUE)) {
            System.out.printf((int) a + " " + sign + " " + (int) b + " = %.3f \n", result);
        }
    }
}