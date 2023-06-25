package homeWork_15_June.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

//Напишите метод, который принимает два списка целых чисел в качестве входных данных
// и возвращает новый список со всеми общими элементами между двумя списками.
// Используйте HashSet для хранения общих элементов.
public class HashSet {
    public static List<Integer> findDoubleElements(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new java.util.HashSet<>(list1);
        set.retainAll(list2);
        List<Integer> doubledElements = new ArrayList<>(set);
        return doubledElements;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> list2 = Arrays.asList(5, 9, 22, 12, 8, 11, 0, 9);
        List<Integer> doubledElements = findDoubleElements(list1, list2);
        System.out.println("Doubled elements: " + doubledElements);


    }
}
