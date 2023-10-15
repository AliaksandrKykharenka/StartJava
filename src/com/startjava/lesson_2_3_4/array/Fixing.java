package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class Fixing {
    public static void main(String[] args) {
        Fixing fixing = new Fixing();
        fixing.addUniqueNumsToArray();
    }

    private  void addUniqueNumsToArray() {
        System.out.print("\n5. Заполнение массива уникальными числами");
        int[] uniqueNums = new int[30];
        int len = uniqueNums.length;
        Random random = new Random();

        uniqueNums[0] = random.nextInt(60, 100);
        for (int i = 1; i < len; i++) {
            int randomNum = random.nextInt(60, 100);
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

    private static void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", array[i]);
        }
        System.out.println();
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i % 10 == 0 ? "\n" : array[i] + " ");
        }
    }
}

