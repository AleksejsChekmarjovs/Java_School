package classWork_20_July;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorsLesson {
    public static void main(String[] args) {


        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Varvara", "Puchkova"));
        persons.add(new Person("Valerij", "Medvedev"));
        persons.add(new Person("Inga", "Cukerberge"));
        persons.add(new Person("Motja", "Positivs"));
        persons.add(new Person("Valerij", "Seriose"));


        System.out.println(persons);

        Collections.sort(persons);
        System.out.println(persons);


    }
}
