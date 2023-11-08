package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.print("Сравниваем числа с десяткой\n");

        Scanner in = new Scanner(System.in);                    //оглашаем существование ручного ввода
        System.out.print("Введите первое число: ");
        int numInt_1 = in.nextInt();                             //Вводим первое число

        if (numInt_1 > 127){                                       //проверяем, находится ли оно в нашем диапазоне
            System.out.println("Первое число находится за пределами бита");
            System.exit(0);
        }

        byte numByte_1 = (byte)numInt_1;                               //переводим его в байты

        System.out.print("Введите второе число: ");
        int numInt_2 = in.nextInt();                             //Вводим второе число

        if (numInt_2 > 127){                                         //проверяем, находится ли оно в нашем диапазоне 2
            System.out.println("Второе число находится за пределами бита");
            System.exit(0);
        }

        byte numByte_2 = (byte)numInt_2;                      //опять переводим в байты

        System.out.println("Первое число в двоичном коде: ");
        System.out.println(Integer.toBinaryString(numByte_1));      //Переводим первое число в двоичный код

        System.out.println("Второе число в двоичном коде: ");
        System.out.println(Integer.toBinaryString(numByte_2));      //Переводим второе

        if ((numByte_1|numByte_2) > 10){                                //Если одно из чисел больше 10:
            if ((numByte_1&numByte_2) > 10) {                           //Если оба числа больше 10 выводим их
                System.out.println("Оба числа оказались больше 10");
                System.out.println(numByte_1);
                System.out.println(numByte_2);
            }
            else{
                if (numByte_1 > 10) {                               //Если только одно из чисел больше 10, то выводим его

                    System.out.println("Первое число оказалось больше 10:");
                    System.out.println(numByte_1);
                }
                else{
                    System.out.println("Второе число оказалось больше 10:");
                    System.out.println(numByte_2);
                }
            }

        }

        // при создании переменной вида byte what42_5 = 42.5; компилятор ругается и хочет видеть дабл

    }
}
