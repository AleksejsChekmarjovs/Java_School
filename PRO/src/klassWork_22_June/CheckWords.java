package klassWork_22_June;

import java.util.Arrays;
import java.util.List;

public class CheckWords {
    public void wordChecking(List<String> words){
        String say1 = Arrays.toString(words.iterator().next().toCharArray());
        String say2;
        say2 = Arrays.toString(words.iterator().next().toCharArray());
        System.out.println(say2 + say1);


    }
}
