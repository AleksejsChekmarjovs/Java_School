package clwork_13_July;

import java.util.LinkedList;
//*
//        Задание 1 * Напишите программу, имитирующую очередь печати для принтера.
//        LinkedList<Document> list = new LinkedList<>();
//Сначала программа должна добавить новые документы в очередь, а затем последовательно,
//        начиная с первого добавленного документа, выводить их по одному на печать и удалять из очереди.

public class ClassWorkLinkedList {
    public static void main(String[] args) {
        LinkedList<Document> list = new LinkedList<>();
        list.add(new Document("first", 1));
        list.add(new Document("second", 2));
        list.add(new Document("third", 3));
        list.add(new Document("fourth", 4));

        System.out.println(list.toString());

        while (!list.isEmpty()){
            Document document = list.poll();
            System.out.println(document.toString());


        }
        System.out.println(list.toString());

    }

   public static class Document{
        private String name;
        int nr;

       public String getName() {
           return name;
       }

       public int getNr() {
           return nr;
       }

       @Override
       public String toString() {
           return "Document{" +
                   "name='" + name + '\'' +
                   ", nr=" + nr +
                   '}';
       }

       public Document(String name, int nr) {
           this.name = name;
           this.nr = nr;

       }
   }


}
