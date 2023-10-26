package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String mathExpression) {
        double result = Double.MIN_VALUE;
        String[] elements = mathExpression.split(" ");
        double a = Double.parseDouble(elements[0]);
        char sign = elements[1].charAt(0);
        double b = Double.parseDouble(elements[2]);
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
}