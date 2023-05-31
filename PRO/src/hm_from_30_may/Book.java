package hm_from_30_may;

public class Book extends PrintedEdition{

    int isbn;

    public Book(int catalogNr, String name, int cost, String place, String holder, int isbn) {
        super(catalogNr, name, cost, place, holder);
        this.isbn = isbn;
        isItPossibleToTakeAway();
    }

    public Book(int catalogNr, String name, int cost, String place, int isbn) {
        super(catalogNr, name, cost, place);
        this.isbn = isbn;
    }
}

