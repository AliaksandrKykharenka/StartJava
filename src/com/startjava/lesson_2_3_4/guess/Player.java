package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int[] nums = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int nums) {
        if (attempt < 10) {
            this.nums[attempt] = nums;
            attempt++;
        }
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int getNum() {
        if (attempt == 0) {
            return nums[attempt];
        } else {
            return nums[attempt - 1];
        }
    }
}