package lesson7;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Василий", 10);
        catArray[1] = new Cat("Барсик", 150);
        catArray[2] = new Cat("Бегемот", 17);
        catArray[3] = new Cat("Мистер Мурочка", 3);
        catArray[4] = new Cat("Кисуля", 100);

        Plate plate = new Plate(150);

        for(Cat cat: catArray){
            cat.eat(plate);
            cat.info();
            plate.addFood(5);
            plate.info();
            System.out.println();
        }

        plate.addFood(10);
        catArray[4].eat(plate);
        plate.info();

      }
    }
