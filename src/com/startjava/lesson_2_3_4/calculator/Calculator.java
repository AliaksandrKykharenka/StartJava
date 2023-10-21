package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private double a;
    private char sign;
    private double b;
    private double result;

    public void calculate(String inputMathExpression) {
        String[] separateMathExpression = inputMathExpression.split(" ");
        a = Double.parseDouble(separateMathExpression[0]);
        sign = separateMathExpression[1].charAt(0);
        b = Double.parseDouble(separateMathExpression[2]);
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