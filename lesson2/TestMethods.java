package lesson2;

 public class TestMethods {

     public static boolean within10and20(int a, int b) {
         int s = a + b;
         if (s > 10 && s < 20) return true;
         else return false;
     }


     public static void isPositiveOrNegative(int x) {
         if (x >= 0) {
             System.out.println("Положительное число");
         } else {
             System.out.println("Отрицательное число");
         }
     }

        public static boolean isNegative(int x) {
             if (x<0) {
                 return true;
             }
             else return false;
         }
          public static void printWordNTimes(String word, int times) {
             for (int i = 0; i < times; i++) {
                 System.out.println(word);
             }
         }

 }