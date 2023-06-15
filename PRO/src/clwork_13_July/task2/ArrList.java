package clwork_13_July.task2;

import java.util.ArrayList;
import java.util.Random;

public class ArrList {
    public void arrEndAdding(){
        Random random = new Random();

        double startTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(random.nextInt(10000));
        }
        double finishTime = System.currentTimeMillis();
        System.out.println(arrayList.size() + " units added");
        System.out.println("Working time for adding in arrayList END " + (finishTime - startTime));

    }
    public void arrMidlleAdding(){
        Random random = new Random();

        double startTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(arrayList.size()/2, random.nextInt(10000));
        }
        double finishTime = System.currentTimeMillis();
        System.out.println(arrayList.size() + " units added");
        System.out.println("Working time for adding in arrayList MIDDLE " + (finishTime - startTime));

    }
    public void gettingUnits(){
        Random random = new Random();


        ArrayList<Integer> arrayList = new ArrayList<>();{
            for (int i = 0; i < 1000000; i++) {
                arrayList.add(random.nextInt(10000));

            }
            double startTime = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                arrayList.get(random.nextInt(10000));
            }
            double endTime = System.currentTimeMillis();
         System.out.println(" Getted out in " + (endTime - startTime));
    }





    }



}
