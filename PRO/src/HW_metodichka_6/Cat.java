package HW_metodichka_6;

public class Cat extends Animal{
    static int catCount = 0;

    public Cat(String name){
        super(name, 200, 0);
        catCount++;
    }


    }

