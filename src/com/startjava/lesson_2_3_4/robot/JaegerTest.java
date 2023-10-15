package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setHeight(3);
        jaeger1.setName("Furey");
        jaeger1.setSpeed(6);
        jaeger1.setArmor(16);
        jaeger1.setAi(9);
        jaeger1.setWeight(450);
        System.out.println(jaeger1);
        jaeger1.fly();
        jaeger1.move();
        jaeger1.setHeight(6);
        jaeger1.setName("Hummer");
        jaeger1.setSpeed(9);
        jaeger1.setArmor(89);
        jaeger1.setAi(8);
        jaeger1.setWeight(460);
        System.out.println(jaeger1);
        jaeger1.fly();
        jaeger1.move();
        Jaeger jaeger2 = new Jaeger("Winner", 3, 380, 23, 18, 12);
        System.out.println(jaeger2);
        jaeger2.fly();
        jaeger2.move();
        jaeger2.setName("Shadow");
        jaeger2.setSpeed(9);
        jaeger2.setArmor(89);
        jaeger2.setAi(8);
        jaeger2.setWeight(460);
        System.out.println(jaeger2);
        jaeger2.fly();
        jaeger2.move();
    }
}