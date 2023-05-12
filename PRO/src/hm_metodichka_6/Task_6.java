package hm_metodichka_6;

public class Task_6 {

    public static void main(String[] args) {
        //create animals
        Animal[] animals = {
                new Cat("Rizik"),
                new Dog("Sharik"),
                new Cat("Barsik"),
                new Dog("Lori"),
                new Dog("Domino"),
                new Cat("Vasjanja")
        };
        //go throw all created animals
        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(5);
            System.out.println();
        }
        //print animals count
        System.out.println("Created animals " + Animal.getCount());
        System.out.println("Created cats " + Cat.catCount);
        System.out.println("Created dogs  " + Dog.dogCount);
    }

}


