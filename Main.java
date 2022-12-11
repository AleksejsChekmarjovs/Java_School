
//Дан массив, содержащий все возможные номиналы игральных карт: 6, 7, …, Король, Туз.
//Дан массив, содержащий все возможные масти игральных карт: "Пик", "Треф", "Бубен", "Червей".
//Пользователь вводит количество карт, которое ему нужно выдать.
//Программа случайным образом выбирает из массивов значения номиналов и мастей и выводит требуемое количество карт на экран.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //номинал карты
        String[] cardsNums = {"6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        //масти
        String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};


//размер колоды
        int cardQ = cardsNums.length * suits.length;

        //узнаем сколко карт надо раздать
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите сколько карт раздать: ");
        int cardsInGame = sc.nextInt();


//колода
        String[] deck = new String[cardQ];
        for (int i = 0; i < cardsNums.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = cardsNums[i] + " " + suits[j];
            }
        }

        //тосуем колоду
        for (int i = 0; i < cardQ; i++) {
            int r = i + (int) (Math.random() * (cardQ - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }


        for (int i = 0; i < cardsInGame; i++) {
            System.out.println(deck[i]);
        }


    }
}