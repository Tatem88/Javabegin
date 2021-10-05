package lesson6;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat(100,200, "Василий");
        cat1.setAnimalRun(201);
        if ((cat1 instanceof Cat) && (cat1.getAnimalRun() <= 200)) {
            System.out.println(cat1.getName() + " бежит " + cat1.getAnimalRun() + "!");
        } else {
            System.out.println(cat1.getName() + " может пробежать не больше двухсот метров! :(");
        }

        if (cat1 instanceof Cat) {
            ((Cat)cat1).swim(200);
            System.out.println(cat1.getName() + " - кот. Он не умеет плавать!");
        }

        Animal dog1 = new Dog(500,10, "Бой");
        dog1.setAnimalRun(501);
        if ((dog1 instanceof Dog) && (dog1.getAnimalRun() <= 500)) {
            System.out.println(dog1.getName() + " бежит " + dog1.getAnimalRun() + "!");
        } else {
            System.out.println(dog1.getName() + " может пробежать не больше пятисот метров! :(");
        }

        if ((dog1 instanceof Dog) && (dog1.getAnimalSwim() <= 10)) {
            ((Dog)dog1).swim(10);
            System.out.println(dog1.getName() + " - пёс. Он плывёт " + dog1.getAnimalSwim() + " метров!");
        } else {
            System.out.println(dog1.getName() + " не может плыть больше 10 метров! :(");
        }

    }

}
