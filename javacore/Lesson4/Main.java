package Lesson4;

import java.util.*;

public class Main {
    public static void main(String[]args){
        String[] words = {"кошка", "собака", "птица", "кошка", "енот",
                "волк", "лиса", "рысь", "медведь", "лось",
                "лиса", "сова", "белка", "лошадь", "мышь",
                "ёж", "снигирь", "ёж", "цапля", "журавль"};

        Set<String> wordsList = new TreeSet<>(Arrays.asList(words));
        System.out.println(wordsList);

        HashMap<String, Integer> freqWords = new HashMap<>();
        for (String str : wordsList) {
            freqWords.put(str, Collections.frequency(Arrays.asList(words), str));
        }

        System.out.println(freqWords);

        Phonebook pB = new Phonebook();
        pB.add("Иванов", "+79252276341");
        pB.add("Петров", "+79857778889");
        pB.add("Сидоров", "+79252287480");
        pB.add("Ленин", "+79101002003");
        pB.add("Орлов", "+79200471234");
        pB.add("Иванов", "+79157496413");
        pB.add("Кошкин", "+7909808080");
        pB.add("Мышкин", "+79102222222");
        pB.add("Петров", "+79027777777");


        pB.printBook();
        pB.get("Иванов");
        pB.get("Петров");
    }
}
