package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void ArrayInt() {
        int[] arr = {0, 1, 1, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                System.out.println(arr[i]);
            } else {
                arr[i] = 0;
                System.out.println(arr[i]);
            }
        }
    }

    public static void ArrayEmpty() {
        int ARRAY_SIZE = 100;
        int[] arr = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = i + 1;
                System.out.println(arr[i]);
        }
    }

    public static void ArrayMul() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.println(arr[i] * 2);
            }
        }
    }

    public static void ArrayMm() {
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                if (i == j) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }

            }
        }
        Arrays.stream(table).map(Arrays::toString).forEach(System.out::println);

    }


        public static void ImputArr() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите длину массива: ");
            int ARRAY_SIZE = sc.nextInt();
            System.out.println("Введите значение для инициализации: ");
            int val = sc.nextInt();
            sc.close();

            int[] arr = new int[ARRAY_SIZE];
            for(int i = 0; i < ARRAY_SIZE; i++) {
                arr[i] = val;
            }
            System.out.println(Arrays.toString(arr));
        }
}

