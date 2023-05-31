package hm_from_30_may;

public class PrintedEdition {
    int catalogNr;
    String name;
    int cost;
    String place;
    String holder = "Bibliothek";

    public PrintedEdition(int catalogNr, String name, int cost, String place, String holder) {
        this.catalogNr = catalogNr;
        this.name = name;
        this.cost = cost;
        this.place = place;
        this.holder = holder;
    }


    public PrintedEdition(int catalogNr, String name, int cost, String place) {
        this.catalogNr = catalogNr;
        this.name = name;
        this.cost = cost;
        this.place = place;
    }

    public String isItPossibleToTakeAway(){

        if (cost >= 1000) {

            holder = "Bibliothek";
        }
        return holder;
   }

    @Override
    public String toString() {
        return "PrintedEdition{" +
                "catalogNr: " + catalogNr +
                ", name: '" + name + '\'' +
                ", cost: " + cost +
                ", place: '" + place + '\'' +
                ", holder: '" + holder + '\'' +
                '}';
    }


}
