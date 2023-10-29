package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String mathExpression)  {
        String[] elements = mathExpression.split(" ");
        double a = Double.parseDouble(elements[0]);
        char sign = elements[1].charAt(0);

        double b = Double.parseDouble(elements[2]);

        if ((a % 1 != 0) || (b % 1 != 0)) {
            throw new RuntimeException();
        }

        return switch (sign) {
            //case 'e' -> throw RuntimeException();
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;

            default -> Double.MIN_VALUE;
        };
    }
}
//String str = // ...
//String length = switch (str) {
//    case str.length() > 42 -> "long";
//    case str.length() > 19 -> "medium";
//    case str.length() > 1 -> "small";
//    case null || str.length() == 0 -> "empty";
//};