package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    String name;
    private int height;
    private int weight;
    private int speed;
    private int armor;
    private int ai;

    public Jaeger() {
    }

    public Jaeger(String name, int height, int weight, int speed, int armor, int ai) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
        this.ai = ai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAi() {
        return ai;
    }

    public void setAi(int ai) {
        this.ai = ai;
    }


    public void move() {
        System.out.println(name + " is moving");
    }

    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public String toString() {
        return name + "height = " + height + " weight= " + weight + " speed= " + speed +
                " armor= " + armor + " ai= " + ai;
    }
}
