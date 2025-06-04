package collections.map.wordCounter;

import java.util.HashMap;
import java.util.Map;

// Программа предназначена для подсчёта количества вхождений
// каждого слова в заданном тексте.
// Она демонстрирует, как можно использовать отображения (Map)
// для анализа текстовых данных и подсчёта частоты повторения слов.

public class WordCounter {
    public static void main(String[] args) {
        String text = "Java легко освоить, Java — это мощный инструмент";
        String[] words = text.split(" ");
        Map <String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Частоты слов : ");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
