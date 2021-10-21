package Lesson1.Barriers;

import Lesson1.Players.Players;

public class Wall extends Barriers{

    public Wall(int height) {
        super(height);
    }

    public void info(){
        int distance = super.getDistance();
        String type = "Стена";
        System.out.println(type + " " + distance + "  метра в длинну.");
    }

    public boolean moving(Players player) {
        info();
        player.jump();

        if (getDistance() <= player.getJumpLimit()) {
            System.out.println('\t' + player.getName() + " сделал удачный прыжок.");
            return true;
        } else {
            System.out.println('\t' + player.getName() + " это был неудачный прыжок.");
            return false;
        }
    }


    public int getDistance() {
        return super.getDistance();
    }
}
