package com.startjava.lesson_2_3_4.animal;

public class Wolf {
    private String sex;
    private String nickname;
    private int weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("incorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println(nickname + " is going");
    }

    public void sit() {
        System.out.println(nickname + " is sitting");
    }

    public void run() {
        System.out.println(nickname + " is running");
    }

    public void howl() {
        System.out.println(nickname + " is howling");
    }

    public void hunt() {
        System.out.println(nickname + " is hunting");
    }
}