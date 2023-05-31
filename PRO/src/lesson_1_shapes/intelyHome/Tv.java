package lesson_1_shapes.intelyHome;

public class Tv extends Devices{

    @Override
    public String switchOnOff() {
        if (Signalization.on == false){
            Light.on = true;
        }

        return null;
    }
}
