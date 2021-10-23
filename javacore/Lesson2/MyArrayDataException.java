package Lesson2;


public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int x, int y) {
        super("Формат переменной в ячейке массива ["+ x + "х" + y + "] некорректный!");
    }
}