package hm_metodichka_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    //check is food enough for cat
    public void decreaseFood(int amount) {
        food -= amount;
        if (food < 0) {
            food = 0;
        }
    }

    public void addFood(int amount) {
        food += amount;
    }

    public int getFood() {
        return food;
    }
}