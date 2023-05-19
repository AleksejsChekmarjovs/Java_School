package hm_collections_metodichka_3;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Java Homework from metodichka Nr3, collections
 * @author Aleksejs Cekmarjovs
 * version 19 May 2023*/

public class Phonebook {
    private HashMap<String, ArrayList<String>> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phonebook.containsKey(lastName)) {
            ArrayList<String> numbers = phonebook.get(lastName);
            numbers.add(phoneNumber);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phonebook.put(lastName, numbers);
        }
    }

    public ArrayList<String> get(String lastName) {
        return phonebook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();


        phonebook.add("Ivanov", "+123456789");
        phonebook.add("Petrov", "+987654321");
        phonebook.add("Ivanov", "+222222222");

        // search
        ArrayList<String> ivanovPhones = phonebook.get("Ivanov");
        ArrayList<String> petrovPhones = phonebook.get("Petrov");
        ArrayList<String> unknownPhones = phonebook.get("Sidorov"); // unknown name


        System.out.println("phone numbers for Ivanov: ");
        for (String phoneNumber : ivanovPhones) {
            System.out.println(phoneNumber);
        }

        System.out.println("phone numbers for Petrov ");
        for (String phoneNumber : petrovPhones) {
            System.out.println(phoneNumber);
        }

        System.out.println("phone numbers for unknown ");
        for (String phoneNumber : unknownPhones) {
            System.out.println(phoneNumber);
        }
    }
}