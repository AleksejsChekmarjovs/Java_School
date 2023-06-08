import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Задания 1) Дан список (List) из слов.
// Нужно поменять порядок слов в списке на противоположный.
// Например, для списка со значениями cats are funny нужно вернуть список funny are cats.

public class FunnyCats {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("cats", "are", "funny"));

        System.out.println("Original List: " + words);

        Collections.reverse(words);

        System.out.println("reversed List: " + words);
    }
}
