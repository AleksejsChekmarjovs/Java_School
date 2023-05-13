package hm_metodichka_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public String getName() {
        return name;
    }

    //cat eat
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite && !fullness) {
            plate.decreaseFood(appetite);
            fullness = true;
            System.out.println(name + " ate and is full.");
        } else {
            System.out.println(name + " left hungry.");
        }
    }

    public boolean isFull() {
        return fullness;
    }

}
