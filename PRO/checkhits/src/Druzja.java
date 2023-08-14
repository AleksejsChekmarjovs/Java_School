public class Druzja {
    String name;
    int coount = 0;
    boolean isSwitchedLightOn = false;
   public int counting(){
       coount = coount + 1;
       return coount;
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
