package clwork_13_July.task2;
//* Задание 2 * Прочитатйте статью: https://javarush.com/quests/lectures/questsyntaxpro.level13.lecture04
// Напишите программу, которая выполнит:
// 1) операцию добавления 10 000 случайных значений в конец списка и замерит скорость выполнения этой операции (в миллисекундах)
// 2) операцию вставки 10 000 случайных значений в середину списка и замерит скорость выполнения этой операции (в миллисекундах)
// 3) операцию получения 10 000 значений из позиций списка, выбранных случайным образом,
// и замерит скорость выполнения этой операции (в миллисекундах)
// 4) операцию удаления 10 000 элементов из конца списка
// и замерит скорость выполнения этой операции (в миллисекундах)
// 5) операцию удаления 10 000 элементов из середины списка
// и замерит скорость выполнения этой операции (в миллисекундах) для реализации списка ArrayList и LinkedList.
// Для операций вставки в середину списка и удаления из середины списка используйте Iterator (методы it.add(value); и it.remove();).
// На основании полученных данных сделайте выводы, имеет ли смысл исполь

public class ClassWorkTask2 {
    private static int LIST_SIZE = 10000;

    public static void main(String[] args) {
        ArrList arrList = new ArrList();
        LIList liList = new LIList();


        arrList.arrEndAdding();
        liList.linListEndAdding();
        System.out.println("------------------------------------");

        arrList.arrMidlleAdding();
        liList.linkedListMidlleAdding();
        System.out.println("--------------------------------------");

        arrList.gettingUnits();
        liList.gettingUnits();
        System.out.println("----------------------");

        arrList.deletFromEnding();
        liList.deletFromEnding();
        System.out.println("---------------------------");

        liList.deleteFromMidlle();
        arrList.deleteFromMidlle();




    }


}
