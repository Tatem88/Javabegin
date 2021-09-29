package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    //Переменные - параметры игры
    public static final int SIZE = 3;
    public static final char DOTS_TO_WIN = 3;

    //Константы
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = '0';


    //Переменные - игровое поле, случайные числа
    public static char[][] MAP;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static int counter = 0;

    //Основной метод
    public static void main(String[] args) {

        //Игровое поле
        initMap();

        //Вывод игрового поля
        printMap();


        //Главный игровой цикл
        while (true) {
            counter++;
            //Ход игрока
            humanTurn();

            //Печать игрового поля
            printMap();

            //Проверка победителя
            if (checkWin(DOT_X)){
                System.out.println("Вы победили!");
                break;
            }

            //Проверка заполненного поля
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }

            //Ход ИИ
            aiTurn();

            //Печать игрового поля
            printMap();

            //Проверка победителя
            if (checkWin(DOT_O)){
                System.out.println("Компьютер победил!");
                break;
            }
            //Проверка заполненного поля
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }

        }
        System.out.println("Игра окончена!");
        scanner.close();
    }

    private static boolean isMapFull() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (MAP[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;

    }

    private static boolean checkWin(char symbol) {
        //Проверка диагоналей
        int diag = 0, diagRev = 0;
        for (int y = 0; y < SIZE; y++) {
            if (MAP[y][y] == symbol) diag++;
            if (MAP[y][SIZE - y - 1] == symbol) diagRev++;
            if (diag == DOTS_TO_WIN || diagRev == DOTS_TO_WIN) return true;
        }
        //Проверка линий
        for (int y = 0; y < SIZE; y++) {
            int line = 0, lineRev = 0;
            for (int x = 0; x < SIZE; x++) {
                if (MAP[y][x] == symbol) line++;            // Проверка горизонтальной линии
                if (MAP[x][y] == symbol) lineRev++;         // Проверка вертикальной линии
                if (line == DOTS_TO_WIN || lineRev == DOTS_TO_WIN) return true;
            }
        }
        return false;
    }

    private static void aiTurn() {

       for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (isCellValid(i, j)){
                    MAP[j][i] = DOT_O;
                    if (checkWin(DOT_O)) return;
                    MAP[j][i] = DOT_EMPTY;
                }
            }
        }

        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++){
                if (isCellValid(i, j)){
                    MAP[j][i] = DOT_X;
                    if (checkWin(DOT_X)) {
                        MAP[j][i] = DOT_O;
                        return;
                    }
                    MAP[j][i] = DOT_EMPTY;
                }
            }

        int x, y;
        do{
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        MAP[y][x] = DOT_O;
    }

    private static void humanTurn() {
        int x, y;
        do{
            System.out.println("Введите координату ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        MAP[y][x] = DOT_X;
    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE) return false;
        if (y < 0 || y >= SIZE) return false;
        return MAP[y][x] == DOT_EMPTY;
    }

    private static void printMap() {

        //Разметка сверху
        System.out.print("♥ ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Вывод поля
        for (int y = 0; y < SIZE; y++) {
            System.out.print((y + 1) + " ");
            for (int x = 0; x < SIZE; x++) {
                System.out.print(MAP[y][x] + " ");
            }
            System.out.println();
        }

        //Дополнительный отступ
        System.out.println();
    }

    private static void initMap() {
        MAP = new char[SIZE][SIZE];
        for (int i=0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

}
