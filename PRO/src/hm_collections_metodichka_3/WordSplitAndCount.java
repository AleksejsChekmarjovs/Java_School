package hm_collections_metodichka_3;

/*
 * Java Homework from metodichka Nr3, collections
 * @author Aleksejs Cekmarjovs
 * version 19 May 2023*/


import java.util.ArrayList;
import java.util.HashMap;

public class WordSplitAndCount {
    public static void main(String[] args) {
        String text = "В траве сидел кузнечик В траве сидел кузнечик Совсем как огуречик Зелененький он был Представьте себе представьте себе Совсем как огуречик Представьте себе представьте себе";


        String[] words = text.toLowerCase().split(" ");

        ArrayList<String> uniqueWords = new ArrayList<>();
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }

            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("unique words: ");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("word repetition of each word: ");
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
    }
}