package ru.geekbrains.qa.java2.lesson1.src.main.java.Lesson5;

public class Main {
    public static void main(String[]args){
            AppData appData = new AppData(new String[]{"Value 1", "Value 2", "Value 3"}, new int[][]{{100,200,123},{300,400,500}});
            appData.WriteData();
            appData.ReadData();
    }
}
