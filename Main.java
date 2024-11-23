import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        String[] words = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                          "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь",
                          "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                          "Июль", "Август"};
        List<String> uniqueWords =s(words);
        Map<String, Integer> wordCounts = a(words);

        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Количество слов:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
                }
            }

            public static List<String> s (String[] words) {
                Set<String> uniqueWordsSet = new HashSet<>();
                for (String word : words) {
                    uniqueWordsSet.add(word);
                }
                return new ArrayList<>(uniqueWordsSet);
            }
            public static Map<String, Integer> a(String[] words) {
                Map<String, Integer> wordCounts = new HashMap<>();
                for (String word : words) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
                return wordCounts;
            }
        }