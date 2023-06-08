import java.util.*;

//Задания 1) Дан список (List) из слов.
// Нужно поменять порядок слов в списке на противоположный.
// Например, для списка со значениями cats are funny нужно вернуть список funny are cats.

public class FunnyCats {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("cats", "are", "funny"));

        System.out.println("Original List: " + words);


        List<String> reversedWords = reverseList(words);

        System.out.println("Reversed list: " + reversedWords);
    }

    public static List<String> reverseList(List<String> list) {
        List<String> reversedList = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            reversedList.add(0, iterator.next());
        }
        return reversedList;
    }
}
