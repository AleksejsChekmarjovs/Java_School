package HW_metodichka_6;

public class Dog extends Animal{
    static int dogCount = 0;
    public Dog(String name){
        super(name, 500, 10);
        dogCount++;
    }
}
