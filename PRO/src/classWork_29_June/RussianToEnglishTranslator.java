package classWork_29_June;
//Задание 1 Создайте русско-английский словарь в TreeMap.
// Напишите программу, которая переводит текст с русского на английский,
// разбивая текст на отдельные слова (без учета регистра) и переводя их с помощью словаря.
// Если слово в словаре не найдено, оно вставляется в результирующий текст без перевода.

import java.util.Scanner;
import java.util.TreeMap;

public class RussianToEnglishTranslator {
    public static void main(String[] args) {

        TreeMap<String, String> dictionary = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        dictionary.put("jabloko", "apple");
        dictionary.put("mashina", "car");
        dictionary.put("kot", "cat");



        Scanner scanner = new Scanner(System.in);
        System.out.print("enter text on russian: ");
        String russianText = scanner.nextLine();


        String[] russianWords = russianText.split(" ");
        StringBuilder translatedText = new StringBuilder();
        for (String russianWord : russianWords) {
            String englishTranslation = dictionary.getOrDefault(russianWord.toLowerCase(), russianWord);
            translatedText.append(englishTranslation).append(" ");
        }


        System.out.println("translation on english: " + translatedText.toString().trim());
    }
}
