package classWork_15_Juny.treeSetRainbows;
//Задание 3. Создайте Set (TreeSet) с 7 цветами радуги. Выведите их на экран из коллекции в правильном порядке следования.

import java.util.Set;
import java.util.TreeSet;

public class Rainbow {
    public static void main(String[] args) {
        Set<String> rainbow = new TreeSet<>();
        rainbow.add("REd");
        rainbow.add("orange");
        rainbow.add("yellow");
        rainbow.add("green");
        rainbow.add("light blue");
        rainbow.add("blue");
        rainbow.add("violet");
        

    }


}
