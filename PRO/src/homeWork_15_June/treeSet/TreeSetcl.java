package homeWork_15_June.treeSet;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
//Напишите метод,
// который принимает список целых чисел
// в качестве входных данных и возвращает наименьший
// и наибольший элементы списка.
// Используйте TreeSet для хранения отсортированных элементов
public class TreeSetcl {
    public static void findMinMax(List<Integer> numbers){
        TreeSet<Integer> sortedSet = new TreeSet<>(numbers);
        int min = sortedSet.first();
        int max = sortedSet.last();
        System.out.println("Min: " + min );
        System.out.println("Max " + max);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9 , 12, 9, 7, 33, 2);
        findMinMax(numbers);

    }
}
