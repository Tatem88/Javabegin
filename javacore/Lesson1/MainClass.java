package Lesson1;

import Lesson1.Barriers.Barriers;
import Lesson1.Barriers.RunningTrack;
import Lesson1.Barriers.Wall;
import Lesson1.Players.Cat;
import Lesson1.Players.Dog;
import Lesson1.Players.Players;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Players[] players = new Players[4];
        players[0] = new Dog("Тузик", 500, 1);
        players[1] = new Dog("Бобик", 200, 2);
        players[2] = new Cat("Кисуля", 30, 2);
        players[3] = new Cat("Том", 40, 2);


        Barriers[] barriers = new Barriers[2];

        Random rand = new Random();
        boolean isBarr;
        for (int i = 0; i < barriers.length; i++) {
            int distance = rand.nextInt(10000);
            int height = rand.nextInt(5);
            isBarr = rand.nextBoolean();
            if (isBarr) {
                barriers[i] = new RunningTrack(distance);
            } else {
                barriers[i] = new Wall(height);
            }
        }

        boolean result;
        for(Players player : players)
            for(Barriers barrier : barriers) {
                result = barrier.moving(player);
                if (!result) break;
            }
    }
}
