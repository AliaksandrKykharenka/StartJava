package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setAge(10);
        wolf.setColor("white");
        wolf.setSex("mail");
        wolf.setNickname("snowboy");
        wolf.setWeight(70);

        System.out.println(wolf.getNickname() + " " + wolf.getAge() + " " + wolf.getColor() + " " +
                wolf.getSex() + " " + wolf.getWeight());
        wolf.go();
        wolf.howl();
        wolf.hunt();
        wolf.run();
        wolf.sit();
    }
}