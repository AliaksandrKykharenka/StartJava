package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private char sign;
    private int b;
    private int result;

    public void setA(int a) {
        this.a = a;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setB(int b) {
        this.b = b;
    }

    private void printResult() {
        System.out.println(a + " " + sign + " " +
                b + " = " + result);
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
                result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("This math operation is not supported");
                return;
        }
        printResult();
    }
}