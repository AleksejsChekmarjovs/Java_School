
//
//        First level: Разработать программу для управления "Умным домом".
//        С клавиатуры вводится:
//
//        текущее время (в часах от 0 до 23)
////        текущий день недели
////       включена ли сигнализация

//        "Умный дом" должен реализовать следующие сценарии:
//        1) В будний день в 8ч поднять шторы, если хозяева дома (сигнализация отключена)
//        2) В выходной день в 11ч поднять шторы, если хозяева дома
//        3) В будний день в 20ч вечера включить чайник, если хозяев нет дома
//        4) В будний день в 23ч опустить шторы, если шторы были подняты
//        Выполнение действия обозначать выводом соответствующего сообщения на экран.


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scTime = new Scanner(System.in);
        System.out.println("Enter time 0 - 24: ");
        int time = scTime.nextInt();

        Scanner scWeekDays = new Scanner(System.in);
        System.out.println("Enter day of week 1 - 7: ");
        int weekDays = scWeekDays.nextInt();

        Scanner csSignalization = new Scanner(System.in);
        System.out.println("Enter 1 if signalization is ON or 2 if signalization is OFF:");
        int signalization = csSignalization.nextInt();

        boolean signalizationOn = signalization < 2;







        boolean kettleIsHot = time >= 20 && weekDays < 6 != signalizationOn;

        boolean curtainsUp = ((time >= 8 && time < 23 && weekDays < 6) != signalizationOn) || (time >= 11 && weekDays > 5 != signalizationOn);

if (signalizationOn){
    System.out.println("Nobody is home");
}else {
    System.out.println("sombody is home");
}
if (kettleIsHot){
    System.out.println("Kettle is hot");
}else {
    System.out.println("Kettle is cold");
}
if (curtainsUp){
    System.out.println("Curtains are Up");
}else {
    System.out.println("Curtains are closed");
}


    }
}