package collections.map.superApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public  void countWords (Scanner scanner) {
        System.out.println("Введите текст : ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Частота слов : ");
        wordCount.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
