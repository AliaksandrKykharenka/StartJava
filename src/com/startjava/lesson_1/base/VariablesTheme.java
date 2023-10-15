package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte os = 10;
        short pg = 11;
        int ram = 16;
        long bitDepthTheSystem = 64L;
        float availableRam = 15.7F;
        double cpuFrequency = 2.42;
        char osFirstLetter = 'w';
        boolean osOnOff = true;
        System.out.println("operation system: " + os + "\n" +
                "processor generation: " + pg + "\n" +
                "RAM: " + ram + "\n" +
                "bit depth of the system: " + bitDepthTheSystem + "\n" +
                "available RAM: " + availableRam + "\n" +
                "CPU frequency: " + cpuFrequency + "\n" +
                "operation system first letter :" + osFirstLetter + "\n" +
                "operation system on(true) of(false) :" + osOnOff);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double penCost = 100;
        double bookCost = 200;
        double totalDiscount = 0.11;
        double noDiscountSum = penCost + bookCost;
        System.out.println("total prise: " + noDiscountSum + "\n" +
                "sum of discount: " + noDiscountSum * totalDiscount + "\n" +
                "total prise discount included: " + (noDiscountSum -
                (noDiscountSum * totalDiscount)));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" +
                "J  J  aaaaa  V V  aaaaa\n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShor = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("first value of maxByteInteger : " + maxByte + "\n" +
                " incremented : " + ++maxByte + "\n" +
                " decremented : " + --maxByte + "\n" +
                "first value of maxShortInteger : " + maxShor + "\n" +
                " incremented : " + ++maxShor + "\n" +
                " decremented : " + --maxShor + "\n" +
                "first value of maxIntInteger : " + maxInt + "\n" +
                " incremented : " + ++maxInt + "\n" +
                " decremented : " + --maxInt + "\n" +
                "first value of maxLongInteger: " + maxLong + "\n" +
                " incremented : " + ++maxLong + "\n" +
                " decremented : " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int tmp = a;

        System.out.println("5.1 changing values using the third integer:\n" +
                "source values: \n" +
                "a = " + a + "\n" +
                "b = " + b + "\n");
        a = b;
        b = tmp;
        System.out.println("new values: \n" +
                "a = " + a + "\n" +
                "b = " + b);

        System.out.println("\n5.2 changing values using math operation: \n" +
                "source values:" + " \n" +
                "a = " + a + "\n" + //5
                "b = " + b + "\n"); //2
        a += b;
        b = a - b;
        a -= b;
        System.out.println("new values: \n" +
                "a = " + a + "\n" +
                "b = " + b);

        System.out.println("\n5.3 changing values using bitwise operations: \n" +
                "source values: \n" +
                "a = " + a + "\n" +
                "b = " + b + "\n");
        b ^= a;
        a ^= b;
        b ^= a;
        System.out.println("new values: \n" +
                "a = " + a + "\n" +
                "b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("symbol code: " + (int) dollar + "   its symbol ->  " + dollar + "\n" +
                "symbol code: " + (int) asterisk + "   its symbol ->  " + asterisk + "\n" +
                "symbol code: " + (int) atSign + "   its symbol ->  " + atSign + "\n" +
                "symbol code: " + (int) verticalBar + "  its symbol ->  " + verticalBar + "\n" +
                "symbol code: " + (int) tilde + "  its symbol ->  " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        System.out.println("    " + slash + backslash + "\n" +
                "   " + slash + "  " + backslash + "\n" +
                "  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash + "\n" +
                " " + slash + "      " + backslash + "\n" +
                slash + underscore + underscore + underscore + underscore + slash + backslash + underscore +
                underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num / 10 % 10;
        int ones = num % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;
        System.out.println("the number 123 contains: \n" + "hundreds : " + hundreds + "\n" +
                "tens : " + tens + "\n" +
                "ones : " + ones + "\n" +
                "the sum of its digits  S = " + sum + "\n" +
                "product of numbers  P = " + product);

        System.out.println("\n9. Вывод времени");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = seconds / 60 % 60;
        int sec = seconds % 60;
        System.out.println("Result : " + hours + ":" + minutes + ":" + sec);
    }
}
