package ru.geekbrains.qa.java2.lesson1.src.main.java.Lesson5;

import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void WriteData(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\kuzne\\demo.csv"))) {

            for (int i = 0; i < header.length; i++) {
                if (i != header.length - 1) {
                    writer.write(header[i] + ";");
                } else {
                    writer.write(header[i]);
                }

            }
            writer.write("\n");

            for (int i = 0; i < data.length; i++) {
                for(int j = 0; j < data[i].length; j++) {
                    if (j != (data[i].length - 1)) {
                        writer.write(data[i][j] + ";");
                    } else {
                        writer.write(data[i][j] + "\n");
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void ReadData(){
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kuzne\\demo.csv"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

// ...
}
