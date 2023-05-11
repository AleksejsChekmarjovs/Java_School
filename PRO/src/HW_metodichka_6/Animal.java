package HW_metodichka_6;

/* Домашнее задание
Создать классы Cat и Dog с наследованием от класса Animal.
Все животные могут бежать run() и плыть swim().
В качестве параметра каждому методу передается длина препятствия.
Результатом выполнения действия будет печать в консоль.
(Например, метод dog.run(150) сообщает 'Собака пробежала 150 м.' или 'Собака не может пробежать 150 м.');
У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
Для этого необходимо использовать соответствующие поля, которые инициализируются через конструктор.
Кота и собаку необходимо добавить в массив и использовать цикл.
* Добавить подсчет созданных котов, собак и животных (используя статическое поле).
 */

public abstract class Animal {

    String name;
    int maxRunDistance;
    int maxSwimDistance;
    static int animalCount = 0;


    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

        public void run(int distance){
            if (distance <= maxRunDistance){
                System.out.println(name + " ran " + distance + " meters.");
            } else {
                System.out.println(name + " cant run " + distance + " meters.");
            }
        }

        public void swim(int distance){
            if (maxSwimDistance == 0){
                System.out.println(name + " cant swim. " );
            }if (distance <= maxSwimDistance){
                System.out.println(name + " swam " + distance + " meters.");
            }
                else {
                System.out.println(name + " cant swim " + distance + " meters.");
            }
        }
        public static int getCount() {
        return animalCount;
    }
    }






