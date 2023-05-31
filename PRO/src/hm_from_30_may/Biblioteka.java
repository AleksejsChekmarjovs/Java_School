package hm_from_30_may;

public class Biblioteka {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Rings",10,"a5",1250);
        Book book2 = new Book(3, "Daavos", 55, "a3", "peter", 222);

        Journal journal2 = new Journal(2,"Life in space",1001,"a2", "Vasja", 2001,2011);
        System.out.println(book1);
        System.out.println(journal2);
        System.out.println(book2);

    }



}
