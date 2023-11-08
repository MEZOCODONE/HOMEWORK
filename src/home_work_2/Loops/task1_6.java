package home_work_2.Loops;

 /* 1.6. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class task1_6 {
    public static String[] multiplication() {
      int f = 0;
        String[] arr = new String[100];
        String a = "";
        for(int i = 1; i <= 10; i++){
            for(int k = 1; k <= 10; k++){
                a = (i + " x " + k + " = " + (i * k));
                arr[f] = a;
                f++;

            }
        }
        return arr;
    }
    @Test
    void testMultiplication(){
        Assertions.assertEquals("1 x 2 = 2", multiplication()[1]);
    }

}
