package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] num = new int[10];
    private int counter;

    public String getName() {
        return name;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int num) {
        if (this.counter < 10) {
            this.num[this.counter] = num;
            this.counter++;
        }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getInteger() {
        if (counter == 0) {
            return num[counter];
        } else {
            return num[counter - 1];
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public void printAttempts() {
        for (int num : Arrays.copyOf(num, counter)) {
            System.out.print(num + " ");
        }
    }
}