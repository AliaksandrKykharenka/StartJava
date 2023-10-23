package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private double a;
    private char sign;
    private double b;
    private double result;

    public double getA() {
        return a;
    }

    public char getSign() {
        return sign;
    }

    public double getB() {
        return b;
    }

    public double getResult() {
        return result;
    }

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
            default -> System.out.println("dsd sd sd s sd");
        }
        return result;
    }
}