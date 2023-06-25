package homework_20_June;

//Есть коллекция Задач (Task). Каждая Задача имеет идентификатор, дату создания,
// приоритет (HIGH, NORMAL, LOW), статус (OPEN, FIXED), описание.
//
//        Отсортируйте коллекцию Задач:
//
//
//        по идентификатору (естественный порядок, Comparable)
//
//        по дате, самые свежие - сначала (Comparator)
//
//        статусу и приоритету, сначала все OPEN, среди всех OPEN выше те, которые HIGH (Comparator)


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HomeWork20June {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(1, "2022.01.03", Task.Priority.HIGHT, Task.Status.OPEN, "first"));
        tasks.add(new Task(2, "2022.01.04", Task.Priority.LOW, Task.Status.FIXED, "second"));
        tasks.add(new Task(5, "2022.01.03", Task.Priority.NORMAL, Task.Status.OPEN, "third"));
        tasks.add(new Task(3, "2022.01.08", Task.Priority.HIGHT, Task.Status.FIXED, "fourth"));
        tasks.add(new Task(4, "2022.02.03", Task.Priority.NORMAL, Task.Status.OPEN, "fifth"));

        Collections.sort(tasks);
        System.out.println("sort by ID: ");
        for (Task task : tasks) {
            System.out.println(task);

        }
        System.out.println("---------------------------------------------------");


        tasks.sort(Comparator.comparing(Task::getDate));
        System.out.println("sort by date: ");
        for (Task task : tasks) {
            System.out.println(task);

        }
        System.out.println("---------------------------------------------------------");

        tasks.sort(Comparator.comparing(Task::getStatus)
                .thenComparing(Comparator.comparing(Task::getPriority).reversed()));
        System.out.println("Sorting by STATUS and PRIORITY: ");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
