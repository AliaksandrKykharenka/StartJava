package com.startjava.lesson_1.final_;

public class Calculator {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 3;
        int result = 0;
        char sign = '%';
        if (sign == '+') {
            result = number1 + number2;
        } else if (sign == '-') {
            result = number1 - number2;
        } else if (sign == '*') {
            result = number1 * number2;
        } else if (sign == '/') {
            result = number1 / number2;
        } else if (sign == '^') {
            result = number1;
            for (int i = 1; i < number2; i++) {
                result *= number1;
            }
        } else if (sign == '%') {
            result = number1 % number2;
        }
        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
    }
}