package arrayListt;

import java.util.ArrayList;
import java.util.Scanner;

public class WordListManipulation {

        public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова (для завершения введите 'exit'):");

        String input = scanner.nextLine();
        while (!input.equals("exit")) {
            words.add(input);
            input = scanner.nextLine();
        }

        // Преобразование слов к верхнему регистру
        ArrayList<String> uppercaseWords = new ArrayList<>(words);
        for (int i = 0; i < uppercaseWords.size(); i++) {
            String word = uppercaseWords.get(i);
            uppercaseWords.set(i, word.toUpperCase());
        }

        System.out.println("Слова в верхнем регистре: ");
        for (String word : uppercaseWords) {
            System.out.println(word);
        }

        // Удаление слов с нечетным количеством букв
        ArrayList<String> evenLengthWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() % 2 == 0) {
                evenLengthWords.add(word);
            }
        }

        System.out.println("Слова с четным количеством букв: ");
        for (String word : evenLengthWords) {
            System.out.println(word);
        }

        // Конкатенация слов в одну строку с помощью StringBuilder
        StringBuilder concatenatedString = new StringBuilder();
        for (String word : words) {
            concatenatedString.append(word);
        }

        System.out.println("Конкатенация всех слов: ");
        System.out.println(concatenatedString.toString());
    }
    }


