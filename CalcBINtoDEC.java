// Пользователь друг за другом вводит с клавиатуры шесть цифр числа в двоичной системе счисления.
//рограмма переводит число из двоичной системы счисления в десятичную по формуле,
// представленной на занятии 3, и выводит его на экран.

import java.util.Scanner;

public class CalcBINtoDEC
    //Вычисление по формуле
{
    public static byte toInteger(String binary) {
        byte decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, (binary.length() - i - 1));
            }
        }
        return (byte)decimal;
    }

    public static void main(String[] args) {
        Scanner bin = new Scanner(System.in);
        System.out.println("Введите число (до семи знаков) в двоичной сис-теме исчисления: ");
        String binary = bin.next();

        byte i = toInteger(binary);

        System.out.println(i);
    }
}