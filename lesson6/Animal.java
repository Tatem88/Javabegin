package lesson6;

public class Animal {
    private int animalRun;
    private int animalSwim;
    private String name;

    public Animal(int animalRun, int animalSwim, String name) {
        this.animalRun = animalRun;
        this.animalSwim = animalSwim;
        this.name = name;
    }

    public int run(int value) {
        return value;
    }

    public int swim(int value) {
        return value;
    }

    public String getName() {
        return name;
    }

    public int getAnimalRun() {
        return animalRun;
    }

    public int setAnimalRun(int animalRun) {
        return this.animalRun = animalRun;
    }

    public int setAnimalSwim(int animalSwim) {
        return this.animalSwim = animalSwim;
    }
    public int getAnimalSwim() {
        return animalSwim;
    }
}

