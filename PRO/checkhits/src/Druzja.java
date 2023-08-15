public class Druzja {
    String name;
    int coount = 0;
    boolean isSwitchedLightOn = false;

    public void counting() {
        coount = coount + 1;
    }


    public Druzja(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return ' ' + name + ' ' + "poluchil " +
                coount + " poshochin"
                ;
    }


}
