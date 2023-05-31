package hm_for_lesson_6;

import java.util.ArrayList;
import java.util.List;

/*
 * Домашнее задание: реализовать:
 * add(int index, int value)
 * addAll(int... values)
 * contains(int value)
 * indexOf(int value)
 * isEmpty()
 * clear()
 * size()
 */

public class Lesson6 {
    public static void main(String[] args) {


        RubberArray rb = new RubberArray();
        System.out.println(rb);
       rb.add(1);
       rb.add(0, 2);
       rb.add(3);
       rb.add(4);
        System.out.println(rb);
        rb.add(2, 5);
        System.out.println(rb);
        int valaris[] = {1, 2, 3, 4, 5};
        rb.addAll(valaris);
        System.out.println(rb);


    }
}
