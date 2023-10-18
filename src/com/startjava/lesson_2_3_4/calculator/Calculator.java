package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private double a;
    private char sign;
    private double b;
    private double result;

    public void setA(double a) {
        this.a = a;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setB(double b) {
        this.b = b;
    }

    private void printResult() {
        if (result % 1 == 0) {
            System.out.printf((int) a + " " + sign + " " + (int) b + " = %.0f \n", result);
        } else {
            System.out.printf((int) a + " " + sign + " " + (int) b + " = %.3f \n", result);
        }
    }

    public void calculate() {
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Error: the sign " + sign + " is not supported");
                return;
        }
        printResult();
    }
}