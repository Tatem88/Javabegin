package Lesson1.Players;

import Lesson1.Barriers.Barriers;

public class Dog implements Players{
    private final String TYPE = "Dog";
    private String name = "NoNameDog";
    private final int runLimit;
    private final int jumpLimit;

    public Dog(String name) {
        this.name = name;
        this.runLimit = 1000;
        this.jumpLimit = 2;
    }

    public Dog(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public void info(){
        System.out.println(TYPE + " имя "+ name +
                ". Предельный бег " + this.runLimit + ", в прыжке " + this.jumpLimit + ".");
    }

    public void run(){
        System.out.println("    Собака " + name + " бежит.");
    }

    public void jump(){
        System.out.println("   Собака " + name + " прыгает.");
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public String getName() { return name;}
}
