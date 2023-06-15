package classWork_15_Juny.autoRent;

//Задание 2.
//В сервисе аренды автомобилей есть автопарк.
// Автомобили каждой марки представлены в нескольких экземплярах.
// О каждом автомобиле известно: номерной знак, марка, мощность двигателя, стоимость аренды.
// Напишите программу, выводящую на экран список марок автомобилей,
// их мощность и стоимость аренды.
// Используйте HashSet<Car>. Не забудьте об equals() и hashCode().

import java.util.HashSet;
import java.util.Set;

public class AutoRent {
    public static void main(String[] args) {
        Set<CarCar> carsInGarage = new HashSet<>();
        carsInGarage.add(new CarCar("VW", 1111, 75, 25));
        carsInGarage.add(new CarCar("Citroen", 2222, 70,15));
        carsInGarage.add(new CarCar("AUDI", 3333, 100, 50));


        System.out.println(carsInGarage);




    }
}
