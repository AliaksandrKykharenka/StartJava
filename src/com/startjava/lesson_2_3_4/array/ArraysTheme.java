package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArraysTheme {
    public static void main(String[] args) {
        ArraysTheme arraysTheme = new ArraysTheme();
        arraysTheme.reverse();
        arraysTheme.multiply();
        arraysTheme.deleteElements();
        arraysTheme.showAlphabet();
        arraysTheme.fillArray();
    }

    public void reverse() {
        System.out.println("\n1. Реверс значений массива");
        int[] nums = {1, 7, 4, 5, 2, 6, 3};
        int len = nums.length;
        System.out.println("Before reverse: " + Arrays.toString(nums));
        for (int i = 0; i < len / 2 + 1; i++) {
            int innerNum = nums[i];
            nums[i] = nums[--len];
            nums[len] = innerNum;
        }
        System.out.println("After reverse:  " + Arrays.toString(nums));
    }

    public void multiply() {
        System.out.println("\n2. Произведение элементов массива");
        int[] multipliers = new int[10];
        int multiplication = 1;
        int len = multipliers.length;
        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
            if (i > 0 && i < 9) {
                multiplication *= i;
                System.out.print(multipliers[i]);
                System.out.print(
                        (multipliers[i] < len - 2) ? " * " : " = " + multiplication);
            }
        }
    }

    public void deleteElements() {
        System.out.println("\n\n3. Удаление элементов массива");
        Random random = new Random();
        Double[] randomNums = new Double[15];
        int len = randomNums.length;
        for (int i = 0; i < len; i++) {
            randomNums[i] = random.nextDouble(1);
            if (i == len / 2 + 1) {
                System.out.println();
            }
        }
        printNums(randomNums);

        System.out.println();
        int zeroQuantity = 0;
        double middleCellValue = randomNums[len / 2 + 1];
        for (int i = 0; i < len; i++) {
            if (randomNums[i] > middleCellValue) {
                randomNums[i] = 0.0;
                zeroQuantity++;
            }
            if (i == len / 2 + 1) {
                System.out.println();
            }
        }
        printNums(randomNums);
        System.out.println("\nZero cells quantity : " + zeroQuantity);
    }

    private static void printNums(Double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", array[i]);
        }
    }

    public void showAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        int len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i > -1; i--) {
            System.out.println(sb + "" + alphabet[i]);
            sb.append(alphabet[i]);
        }
    }

    public void fillArray() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] uniqueNums = new int[30];
        int len = uniqueNums.length;

        uniqueNums[0] = ((int) (Math.random() * (100 - 60))) + 60;
        for (int i = 1; i < len; i++) {
            int randomNum = ((int) (Math.random() * (100 - 60))) + 60;
            for (int j = 0; j < i; j++) {
                if (randomNum == uniqueNums[j]) {
                    randomNum = -1;
                    i--;
                    break;
                }
            }
            if (randomNum != -1) {
                uniqueNums[i] = randomNum;
            }
        }
        Arrays.sort(uniqueNums);
        print(uniqueNums);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i % 10 == 0 ? "\n" : array[i] + " ");
        }
    }
}
