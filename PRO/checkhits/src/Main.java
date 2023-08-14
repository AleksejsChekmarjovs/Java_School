/*
    X человек попали в плен.
    их завели в комнату, где есть лампочка и выключатель.
    им дали несколько минут, чтобы договориться, и затем их разведут по разным камерам, i они друг друга не увидat и не услышаt.
    каждый день одного случайно выбранного будут выводить в эту комнату и давать очень обидную пощёчину.
    в этой комнате есть лампочка и выключатель. Выключателем можно пользоваться.
    чтобы прекратить раздачу пощечин, нужно угадать, когда все точно хотbi раз получиli пощечину. Только один шанс.
    о каком алгоритме договорились эти люди?
*
* */

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random random = new Random();
    static int sifasLightSwithingCounting = 0;
    static boolean light = false;

    public static void hitttedperson(){
        sifasLightSwithingCounting = sifasLightSwithingCounting + 1;


    }



    public static int nextHittingPerson(int integer){
        return random.nextInt(integer);
    }



    public static void main(String[] args) {




        ArrayList<Druzja> druzjaIzChata = new ArrayList<>();
        druzjaIzChata.add(new Druzja("Spy"));
        druzjaIzChata.add(new Druzja("Rem"));
        druzjaIzChata.add(new Druzja("Dimzz"));
        druzjaIzChata.add(new Druzja("Motja"));
        druzjaIzChata.add(new Druzja("Oleg Moldovan"));
        druzjaIzChata.add(new Druzja("Sem"));
        druzjaIzChata.add(new Druzja("Vanja"));
        druzjaIzChata.add(new Druzja("Ljoha"));
        druzjaIzChata.add(new Druzja("Denis Shabalin"));

        int viborSifi = nextHittingPerson((druzjaIzChata.size()));
        Druzja sifa = druzjaIzChata.get(viborSifi);




        while (sifasLightSwithingCounting < druzjaIzChata.size()){

            Druzja nextBodyToHit = druzjaIzChata.get(nextHittingPerson(druzjaIzChata.size()));
            if (nextBodyToHit != sifa){
                if (!light && nextBodyToHit.coount == 0){
                    light = true;
                    nextBodyToHit.counting();
                }
                if (!light && nextBodyToHit.isSwitchedLightOn == false){
                    light = true;
                    nextBodyToHit.counting();
                }
                else {
                    nextBodyToHit.counting();

                }
            }
            if (nextBodyToHit == sifa){
                if (light){
                    hitttedperson();
                    light = false;
                    nextBodyToHit.counting();

                }
                nextBodyToHit.counting();
            }





   } System.out.println(druzjaIzChata);
        System.out.println(sifa + " " + sifasLightSwithingCounting);

    }}



















