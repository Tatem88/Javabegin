package lesson1;

public class HomeWorkApp {
    public static void main() {
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a;
        int b;
        a = 1;
        b = 2;
        System.out.println("result " + (a + b));
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value;
        value = 2;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 || value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }
    public static void compareNumbers() {
        int a;
        int b;
        a = 10;
        b = 15;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
