package classWork_15_Juny.wordCounter;
//Задание 1. Дан текст. Напишите программу, которая посчитает количество уникальных слов в тексте (без учета регистра).
// Используйте HashSet<String>.


import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class WordCounter {


    public static void main(String[] args) {
        Set<String> uniqueWords = new HashSet<>();

        String string = "Дан текст. Напишите программу, которая посчитает количество уникальных слов в тексте ";
        StringTokenizer tokenizer = new StringTokenizer(string.toLowerCase(), " ");
        while (tokenizer.hasMoreTokens()){
            uniqueWords.add(tokenizer.nextToken());

        }
        System.out.println(uniqueWords.size());

    }
}
