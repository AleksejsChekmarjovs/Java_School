package lesson_1_shapes.intelyHome;

public class Signalization extends Devices{
    boolean isHomeOwnerInSide;

    public Signalization(boolean isHomeOwnerInSide) {
        this.isHomeOwnerInSide = isHomeOwnerInSide;
    }

    @Override
    public String switchOnOff() {
        if (isHomeOwnerInSide = true){
            Devices.on = false;
        }else {
            Devices.on = true;
        }

        return null;
    }
}
