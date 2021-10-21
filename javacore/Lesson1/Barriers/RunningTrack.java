package Lesson1.Barriers;

import Lesson1.Players.Players;

public class RunningTrack extends Barriers{

    public RunningTrack(int distance) {
        super(distance);
    }
    public void info(){
        int distance = super.getDistance();
        String type = "Расстояние";
        System.out.println(type + " " + distance  +  " метров.");
    }

    public boolean moving(Players player) {
        info();
        player.run();

        if (getDistance() <= player.getRunLimit()) {
            System.out.println('\t' + player.getName() + " пробежал хорошо.");
            return true;
        } else {
            System.out.println('\t' + player.getName() + " пробежал плохо.");
            return false;
        }
    }

    @Override
    public int getDistance() {
        return super.getDistance();
    }
}
