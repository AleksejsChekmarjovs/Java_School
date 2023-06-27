package klassWork_27_June.mapes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapstringi {
    public static void main(String[] args) {

        String string = "mdn kk flll hf njd lfbn";
        char[] keys = string.toCharArray();

        Map<Character, Integer> chrs = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            chrs.put(keys[i],i);

        }
        System.out.println(chrs.keySet());

        Iterator <Character> chaeIt = chrs.keySet().iterator();
        while (chaeIt.hasNext()){
            int nr = 1;
            char chr = chaeIt.next();
            for (int i = 0; i < keys.length; i++) {
                if (chr == keys[i]){
                    chrs.put(chr, nr);
                    nr++;
                }


            }
        }
        System.out.println(chrs);
    }
}
