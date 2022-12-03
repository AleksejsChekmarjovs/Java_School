import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        System.out.println("введите 1 если вводите в градусах цельсия или 2 если в фаренгейта: ");
        int CH = sc.nextInt();
        if (CH == 1) {





                Scanner scanner = new Scanner(System.in);
            System.out.println("Введите температуру в градусах цельсия :");
                double getThempInC = scanner.nextDouble();
                double tempF = getThempInC * 9 / 5 + 32;
            long roundedNumber = Math.round(tempF);
                System.out.println(roundedNumber + " В градусах фаренгейт");


        } else if (CH == 2) {


                Scanner scanner = new Scanner(System.in);
            System.out.println("Введите температуру в градусах фаренгейт :");
                double getThempInF = scanner.nextDouble();
                double tempC = (getThempInF - 32) * 5 / 9;
                long roundedNumber = Math.round(tempC);
                System.out.println(roundedNumber + " В градусах цельсия");



        } else {
            System.out.println("вы ввели неправильное значение");
        }




    }
}