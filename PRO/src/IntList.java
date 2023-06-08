//2) Дан список (List) целых чисел. Используя Iterator,
// удалите из списка все числа,
// имеющие значение больше X и меньше Y.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

        int x = 10;
        int y = 160;

        System.out.println("Original List: " + integers);

        ListIterator<Integer> integer = integers.listIterator();
        while (integer.hasNext()) {
            int numer = integer.next();
            if (numer <= y && numer >= x) {
                integer.remove();
            }


        }
        System.out.println("List after removing: " + integers);


    }


}



