package lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("В тарелке " + food + " еды.");
    }

    public void decreaseFood(int amount) {
        this.food -= amount;
    }

    public void addFood(int amount) {
        System.out.println("Добавлено " + amount + " еды.");
        this.food += amount;
    }

    public int getFood() {
        return food;
    }
}
