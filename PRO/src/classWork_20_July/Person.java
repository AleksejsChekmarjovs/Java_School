package classWork_20_July;

public class Person implements Comparable<Person>{
    String name;
    String Lastname;

    public Person(String name, String lastname) {
        this.name = name;
        Lastname = lastname;
    }

    @Override
    public String toString() {
        return name + ' ' +
                " " + Lastname
                ;
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.equalsIgnoreCase(o.name)){
            return this.Lastname.compareTo(o.Lastname);
        }else {
            return this.name.compareTo(o.name);
        }

    }


}
