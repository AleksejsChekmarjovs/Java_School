package hm_from_30_may;

public class Journal extends PrintedEdition{
    int journalNr;
    int year;



    public Journal(int catalogNr, String name, int cost, String place, String holder, int journalNr, int year) {
        super(catalogNr, name, cost, place, holder);
        this.journalNr = journalNr;
        this.year = year;
        isItPossibleToTakeAway();
    }

    public Journal(int catalogNr, String name, int cost, String place, int journalNr, int year) {
        super(catalogNr, name, cost, place);
        this.journalNr = journalNr;
        this.year = year;
    }
}


