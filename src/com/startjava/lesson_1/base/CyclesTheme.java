package com.startjava.lesson_1.base;

import static java.lang.Character.getName;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("In the interval [-10, 21] the sum of even numbers X = " + sumEven +
                "; and odd numbers Y = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int number1 = 5;
        int max = -1;
        int min = 10;
        int number2 = 0;
        if (number1 > max) {
            max = number1;
        }
        if (max < min) {
            max = min;
        }
        if (number2 < min) {
            min = -1;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number4 = 1234;
        int sumDigits = 0;
        while (number4 > 0) {
            int digit = number4 % 10;
            sumDigits += digit;
            System.out.print(digit);
            number4 /= 10;
        }
        System.out.println(" the sum of reverse number: " + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int endNumber = 24;
        int counter1 = 0;
        for (int i = 1; i < endNumber; i += 2) {
            counter1++;
            System.out.printf("%4d", i);
            if (counter1 == 5) {
                counter1 = 0;
                System.out.println();
            }
            int quantityZeros = 5 - counter1;
            if (i == endNumber - 1 && quantityZeros != 5) {
                for (int j = 0; j < quantityZeros; j++) {
                    System.out.printf("%4d", 0);
                }
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int number5 = 32425922;
        int countTwos = 0;
        System.out.print("В ");
        while (number5 > 0) {
            int digit = number5 % 10;
            if (digit == 2) {
                countTwos++;
            }
            System.out.print(digit);
            number5 /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println(" (четное) количество двоек " + countTwos);
        } else {
            System.out.println(" (нечетное) количество двоек " + countTwos);
        }

        System.out.println("\n6. Отображение геометрических фигур\n");
        for (int i = 1; i < 51; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        int counter2 = 0;
        while (counter2 < 15) {
            System.out.print("#");
            if (counter2 == 4) {
                System.out.println();
            } else if (counter2 == 8) {
                System.out.println();
            } else if (counter2 == 11) {
                System.out.println();
            } else if (counter2 == 13) {
                System.out.println();
            }
            counter2++;
        }
        System.out.println("\n");

        int counter3 = 0;
        do {
            System.out.print("$");
            if (counter3 == 0) {
                System.out.println();
            }
            counter3++;
        } while (counter3 < 2);

        do {
            System.out.print("$");
            if (counter3 == 2) {
                System.out.println();
            } else if (counter3 == 5) {
                System.out.println();
            } else if (counter3 == 7) {
                System.out.println();
            }
            counter3++;
        } while (counter3 < 9);

        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.printf("%-10s%-15s%-17s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (char i = 15; i < 122; i++) {
            if (i % 2 == 1 && i < 48) {
                System.out.printf("  %-12d%-16c%-15s%n", (int) i, i, getName(i));
            } else if (i % 2 == 0 && i >= 97) {
                System.out.printf("  %-12d%-16c%-15s%n", (int) i, i, getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int number6 = 1234321;
        int copyNumber6 = number6;
        int reverseNumber = 0;
        while (copyNumber6 > 0) {
            int digit = copyNumber6 % 10;
            reverseNumber = reverseNumber * 10 + digit;
            copyNumber6 /= 10;
        }
        if (number6 == reverseNumber) {
            System.out.println("The number " + number6 + " is palindrome");
        } else {
            System.out.println("The number " + number6 + " is not palindrome");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int number7 = 123321;
        int firstHalf = number7 % 1000;
        int copyFirstHalf = firstHalf;
        int secondHalf = number7 / 1000;
        int copySecondHalf = secondHalf;
        int secondSum = 0;
        int firstSum = 0;
        for (int i = 0; i < 3; i++) {
            int digit = copyFirstHalf % 10;
            secondSum += digit;
            copyFirstHalf /= 10;
            digit = copySecondHalf % 10;
            firstSum += digit;
            copySecondHalf /= 10;
        }
        if (firstSum == secondSum) {
            System.out.print("The number : " + number7 + " is happy\n");
        } else {
            System.out.print("The number : " + number7 + " is unhappy\n");
        }
        System.out.println("The sum of the first half " + secondHalf + " = " + firstSum + "\n" +
                "The sum of the second half " + firstHalf + " = " + secondSum);

        System.out.print("\n10. Отображение таблицы умножения Пифагора\n" + "   |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n  ");
        for (int i = 1; i < 27; i++) {
            System.out.print("_");
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            for (int j = i; j <= i * 9; j += i) {
                System.out.printf("%3d", j);
                if (j == i) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}