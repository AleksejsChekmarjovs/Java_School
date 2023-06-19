package clwork_13_July.task2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class LIList {
    private static int LIST_SIZE = 10000;
    Random random = new Random();


    public void linListEndAdding() {


        double startTime = System.currentTimeMillis();

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < LIST_SIZE; i++) {
            linkedList.add(random.nextInt(LIST_SIZE));
        }
        double finishTime = System.currentTimeMillis();
        System.out.println(linkedList.size() + " units added in LINKEDlist");
        System.out.println("Working time for adding in LINKEDList END " + (finishTime - startTime));

    }

    public void linkedListMidlleAdding() {


        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            linkedList.add(random.nextInt(LIST_SIZE));
        }
        double startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator = (ListIterator<Integer>) linkedList.iterator();
        for (int i = 0; i < LIST_SIZE / 2; i++) {
            iterator.next();
        }
        for (int i = 0; i < LIST_SIZE; i++) {
            iterator.add(random.nextInt(LIST_SIZE));
//            linkedList.add(linkedList.size()/2, random.nextInt(LIST_SIZE));
        }
        double finishTime = System.currentTimeMillis();
        System.out.println(linkedList.size() / 2 + " units added");
        System.out.println("Working time for adding in LinkedList MIDDLE " + (finishTime - startTime));

    }

    public void gettingUnits() {


        LinkedList<Integer> linkedList = new LinkedList<>();
        {
            for (int i = 0; i < LIST_SIZE; i++) {
                linkedList.add(random.nextInt(LIST_SIZE));

            }
            double startTime = System.currentTimeMillis();
            for (int j = 0; j < LIST_SIZE; j++) {
                linkedList.get(random.nextInt(LIST_SIZE));
            }
            double endTime = System.currentTimeMillis();
            System.out.println(" Got out " + linkedList.size() + " units from LInked List random position in " + (endTime - startTime));
        }
    }

    public void deletFromEnding() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < LIST_SIZE; i++) {
            linkedList.add(random.nextInt(LIST_SIZE));
        }
        // System.out.println(linkedList.size());
        double startTime = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            linkedList.remove(linkedList.size() - 1);


        }
        double endTime = System.currentTimeMillis();
        System.out.println(LIST_SIZE + " units deleted from the LinkedList end " + (endTime - startTime));
    }
    public void deleteFromMidlle(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < LIST_SIZE; i++) {
            linkedList.add(random.nextInt(LIST_SIZE));
        }

       ListIterator<Integer> iterator = linkedList.listIterator();
        double startTime = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE/2; i++) {
            iterator.next();

        }
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        double endTime = System.currentTimeMillis();
        System.out.println(" Deleted from LinkedList Midlle in " + (endTime-startTime));
    }
}

