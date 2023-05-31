package lesson_1_shapes.intelyHome;

public class Main {
    public static void main(String[] args) {
        Signalization signalization = new Signalization(false);
        Light light = new Light();
        Tv tv = new Tv();
        DishWashMachine dishWashMachine = new DishWashMachine(true);
        Light light1 = new Light();

        System.out.println(dishWashMachine);
        System.out.println(light1.switchOnOff());
    }


}
