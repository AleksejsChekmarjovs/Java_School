package hm_metodichka_6;



//cats
public class Cat extends Animal {
    static int catCount = 0;

    //cats max distancec
    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }


}

