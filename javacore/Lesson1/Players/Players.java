package Lesson1.Players;


import Lesson1.Barriers.Barriers;

public interface Players {

    void run();

    void jump();

    void info();

    int getRunLimit();

    int getJumpLimit();

    String getName();
}
