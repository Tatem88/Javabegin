package Lesson1.Players;

import Lesson1.Barriers.Barriers;

public class Cat implements Players{
    private final String TYPE = "Cat";
    private String name = "NoNameCat";
    private final int runLimit;
    private final int jumpLimit;

    public Cat(String name) {
        this.name = name;
        this.runLimit = 50;
        this.jumpLimit = 3;
    }

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public void info(){
        System.out.println(TYPE + " имя "+ name +
                ". Предельный бег " + this.runLimit + ", в прыжке " + this.jumpLimit + ".");
    }

    public void run(){
        System.out.println("   Кот " + name + " бежит.");
    }

    public void jump(){
        System.out.println("    Кот " + name + " прыгает.");
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }
    public String getName() { return name;}
}