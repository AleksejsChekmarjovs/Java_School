import java.util.Scanner;


//First level: Пользователь вводит с клавиатуры текст, состоящий из нескольких слов, и слово, которое нужно удалить из текста.
// Программа вырезает из текста указанное слово и выводит получившийся текст на экран.

public class Main {
    public static void main(String[] args) {

        //фраза из которой вырезаем
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите знаменитую фразу кота Леопольда: ");
        String st1 = sc1.nextLine();

//слово которое вырезаем
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите слово которое хотите удалить: " );  ;
        String st2 = sc.next();
//вырезаем
        String newst =  st1.replaceAll(st2,"");


        System.out.println(newst);
    }
}