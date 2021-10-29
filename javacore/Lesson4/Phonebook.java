package Lesson4;

import java.util.*;


public class Phonebook {
    HashMap<String, String> phoneBook;

    public Phonebook() {
        this.phoneBook = new HashMap<>();
    }

    public void printBook(){
        if (this.phoneBook.size() != 0){
            List<String> printedBook = new ArrayList<>();
            for (Map.Entry<String, String> field : this.phoneBook.entrySet()) {
                printedBook.add(field.getValue() + ": " + field.getKey());
            }
            printedBook.sort(null);
            for(String line: printedBook){
                System.out.println(line);
            }
        }
        else System.out.println("Телефонная книга пуста!");
    }

    public void add(String lastName, String phone){
        this.phoneBook.put(phone, lastName);
    }

    public void get(String lastName) {
        System.out.println("Список контактов с фамилией: " + lastName);
        for (Map.Entry<String, String> field : this.phoneBook.entrySet())
            if (lastName.equals(field.getValue())) System.out.println(field.getValue() + ": " + field.getKey());
    }
}
