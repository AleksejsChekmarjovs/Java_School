package classWork_11_July;/* Задание 1 Дано: Arrays.asList("a1", "b5", "a2", "b4");
Найти самый маленький элемент.
Задание 2 Дано: Arrays.asList(1, 12, 3, 10, 12, 17);
 Найти все нечётные числа.
  Задание 3 Дано: Arrays.asList(1, 12, 3, 10, 12, 17);
   Увеличить каждое значение на 20%
   Задание 4 Дано: Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
    Найти сколько раз объект «Big» встречается в коллекции.
     Задание 5 Дано: Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
 // Задание 6 Дан список чисел. Используя Stream API, вычислите сумму всех чисел, затем найдите их среднее значение.
// Задание 7 Дан список объектов класса Person, у каждого объекта есть свойство name.
// Используя Stream API, отсортируйте список объектов в алфавитном порядке по имени.
// Задание 8 Дан список строк, представляющих предложения.
// Используя Stream API и методы flatMap(), filter(), map(), distinct(), reduce() и sorted(): - найдите все уникальные слова в списке строк и сох*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExercises {
    public static void main(String[] args) {
        //Задание 1 Дано: Arrays.asList("a1", "b5", "a2", "b4");
        //Найти самый маленький элемент.
        List<String> arrLi = Arrays.asList("a1", "b5", "a2", "b4");

        System.out.println(arrLi.stream().sorted().findFirst());

        //Задание 2 Дано: Arrays.asList(1, 12, 3, 10, 12, 17);
        // Найти все нечётные числа.
        System.out.println(Arrays.asList(1, 12, 3, 10, 12, 17).stream().filter(i-> i%2==0).collect(Collectors.toList()));

        // Задание 3 Дано: Arrays.asList(1, 12, 3, 10, 12, 17);
        //   Увеличить каждое значение на 20%

        System.out.println(Arrays.asList(1, 12, 3, 10, 12, 17).stream().map(i -> i * 2).collect(Collectors.toList()));

        // Задание 4 Дано: ;
        //    Найти сколько раз объект «Big» встречается в коллекции.
        System.out.println(Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob").stream().filter(i -> i.contains("Big")).count());

        //Задание 5 Дано: Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        //Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
        System.out.println(Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1").stream().sorted((s1,s2) -> (-1)*s1.compareTo(s2)).distinct().collect(Collectors.toList()));

        //Задание 6 Дан список чисел. Используя Stream API, вычислите сумму всех чисел, затем найдите их среднее значение.
        List<Integer> intList = Arrays.asList(1, 12, 3, 10, 12, 17);

        System.out.println("summ: " + intList.stream());



    }
}