package clwork_13_July.task2;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class ArrList {
    private static final int LIST_SIZE = 10000;
    Random random = new Random();


    public void arrEndAdding() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        double startTime = System.currentTimeMillis();

        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(random.nextInt(LIST_SIZE));
        }
        double finishTime = System.currentTimeMillis();

        System.out.println("Working time for adding " + LIST_SIZE + " units in arrayList END " + (finishTime - startTime));

    }

    public void arrMidlleAdding() {
        // System.out.println(arrayList.size());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(random.nextInt(LIST_SIZE));
        }
        double startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator = arrayList.listIterator();
        for (int i = 0; i < LIST_SIZE/ 2; i++) {
            iterator.next();

        }
        for (int i = 0; i < LIST_SIZE; i++) {
            iterator.add(random.nextInt(LIST_SIZE));

        }


        double finishTime = System.currentTimeMillis();

        System.out.println("Working time for adding " + LIST_SIZE + " units in arrayList MIDDLE " + (finishTime - startTime));

    }

    public void gettingUnits() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(random.nextInt(LIST_SIZE));
        }


            double startTime = System.currentTimeMillis();
            for (int j = 0; j < LIST_SIZE; j++) {
                arrayList.get(random.nextInt(LIST_SIZE));
            }
            double endTime = System.currentTimeMillis();
            System.out.println(LIST_SIZE + " units from Array List random position in " + (endTime - startTime));
        }




    public void deletFromEnding() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(random.nextInt(LIST_SIZE));
        }
        // System.out.println(arrayList.size());
        double startTime = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.remove(arrayList.size() - 1);


        }
        double endTime = System.currentTimeMillis();
        System.out.println(LIST_SIZE + " units deleted from the ArrayList end " + (endTime - startTime));
    }
    public void deleteFromMidlle(){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(random.nextInt(LIST_SIZE));
        }

        ListIterator<Integer> iterator = arrayList.listIterator();
        double startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size()/2; i++) {
            iterator.next();

        }
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        double endTime = System.currentTimeMillis();
        System.out.println(" Deleted from ArrayList Midlle in " + (endTime-startTime));
    }


}
