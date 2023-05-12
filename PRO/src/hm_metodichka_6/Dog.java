package hm_metodichka_6;

//dogs
public class Dog extends Animal {
    static int dogCount = 0;

    //dogs max distances
    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }
}
