//2) Дан список (List) целых чисел. Используя Iterator,
// удалите из списка все числа,
// имеющие значение больше X и меньше Y.


import java.util.ArrayList;
import java.util.List;

public class IntList {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(new ArrayList(1));
        integers.add(2);
        integers.add(5);
        integers.add(15);
        integers.add(55);
        integers.add(150);
        integers.add(99);
        integers.add(205);

        System.out.println("Original List: " + integers);

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) >= 10 && integers.get(i) <= 160){
                integers.remove(i);

        }

        }
        System.out.println("List after removing: " + integers);
    }
}
