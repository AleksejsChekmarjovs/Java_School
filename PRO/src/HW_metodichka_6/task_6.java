package HW_metodichka_6;

public class task_6 {

    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Rizik"),
                new Dog("Sharik"),
                new Cat("Barsik"),
                new Dog("Lori"),
                new Dog("Domino"),
                new Cat("Vasjanja")
        };

        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(5);
            System.out.println();
        }

        System.out.println("Created animals " + Animal.getCount());
        System.out.println("Created cats " + Cat.catCount);
        System.out.println("Created dogs  " + Dog.dogCount);
    }

    }


