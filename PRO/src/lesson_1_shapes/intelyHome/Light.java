package lesson_1_shapes.intelyHome;

public class Light extends Devices{

    public String switchOnOff() {
        if (Signalization.on == false){
            Light.on = true;
        }
        String status = "Light ON :" + Light.on;
        return status;

    }

}
