package hm_metodichka_7;


/*
* Java Homework Nr4
 * @autor Aleksejs Cekmarjovs
 * version 13 May 2023
 */

//Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//        Этот контроль должен быть внутри класса.
//        Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. Сытый кот не кушает.
//        Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//        Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//        Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.


public class CatEatHisCookies {
    public static void main(String[] args) {
        //create cats
        Cat[] cats = {
                new Cat("Basja", 5),
                new Cat("Rizik", 10),
                new Cat("Imbirj", 15),
                new Cat("Timosha", 25)};
        //create plate
        Plate plate = new Plate(20);

        //print amount of food in plate
        System.out.println("plate have " + plate.getFood() + " food.");
        System.out.println();

        //go throw each cat
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " fullness: " + cat.isFull());
        }
        //print food amount in plate after eating
        System.out.println();
        System.out.println("still in plate " + plate.getFood() + " food.");
        System.out.println();

        //put in plate more food
        plate.addFood(10);
        System.out.println("Put in plate more food.");
        System.out.println();

        //go throw each cat
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " fullness: " + cat.isFull());
        }


    }
}