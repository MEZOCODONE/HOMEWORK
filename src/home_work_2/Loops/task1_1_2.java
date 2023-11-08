package home_work_2.Loops;
/*  1.1.2 Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю используя рекурсию */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class task1_1_2 {

    public static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }

    @Test
    void inNotZero(){
        Assertions.assertEquals(6, factorial(3));
    }
    @Test
    void inEqualsZero(){
        Assertions.assertEquals(1, factorial(0));
    }
}


