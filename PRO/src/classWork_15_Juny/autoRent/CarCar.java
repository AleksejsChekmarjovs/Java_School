package classWork_15_Juny.autoRent;

import java.util.Objects;

public class CarCar {
    String mark;
    int number;
    int enginePowerInHorses;
    int rentCost;

    @Override
    public String toString() {
        return "CarCar{" +
                "mark='" + mark + '\'' +
                ", enginePowerInHorses=" + enginePowerInHorses +
                ", rentCost=" + rentCost +
                '}';
    }

    public CarCar(String mark, int number, int enginePowerInHorses, int rentCost) {
        this.mark = mark;
        this.number = number;
        this.enginePowerInHorses = enginePowerInHorses;
        this.rentCost = rentCost;




    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarCar carCar)) return false;
        return number == carCar.number && enginePowerInHorses == carCar.enginePowerInHorses && rentCost == carCar.rentCost && Objects.equals(mark, carCar.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, number, enginePowerInHorses, rentCost);
    }
}
