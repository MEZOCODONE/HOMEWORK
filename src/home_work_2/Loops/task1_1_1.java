package home_work_2.Loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
/*  1.1.1 Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю используя только цикл */

public class task1_1_1 {
    public static long smth(int num) {
        long a = 1;
        int k = 2;
        if (num < 21) {
            if (num != 0) {
                for (int i = 1; i <= num; i++) {
                    a = a * i;
                }
                System.out.println(a);
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("Переполнение");
        }
            return a;
    }


    @Test
    void checkDigit(){
        Assertions.assertEquals(6, smth(3));
    }
}

