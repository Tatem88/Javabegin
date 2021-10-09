package lesson7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate){

        if (this.appetite > plate.getFood()) System.out.println("Кот " + name + " очень голоден  :(");
        else if (this.satiety) System.out.println("Кот " + name + " сыт!");
        else {
            System.out.println("Кот " + name + " кушает!");
            plate.decreaseFood(this.appetite);
            this.satiety = true;
        }
    }

    public void info(){
        System.out.println("Кот " + this.name + ", аппетит: " + this.appetite + ", сытость: " + this.satiety);
    }
}
