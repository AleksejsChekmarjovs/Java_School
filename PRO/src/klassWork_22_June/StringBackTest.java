package klassWork_22_June;
//Задание Пользователь вводит с клавиатуры два слова.
// Напишите программу, которая проверит является ли одно слово обратным написанием другого.
// Пример: cat - tac = true Используйте Stack.

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StringBackTest {
    public static void main(String[] args) {
        List<String> words = new Stack<>();
        Scanner yourWord = new Scanner(System.in);
        System.out.println("Enter word: ");


        words.add(yourWord.nextLine());

        words.add(yourWord.nextLine());

        System.out.println(words);
        CheckWords checkWords = new CheckWords();
        checkWords.wordChecking(words);







    }

}
