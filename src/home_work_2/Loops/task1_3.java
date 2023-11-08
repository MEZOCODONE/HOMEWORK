package home_work_2.Loops;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

/*      1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
        Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
        Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.          */

public class task1_3 {


    public static float toThePower(float number, int toThePower) {

        float step = number;

        if (toThePower != 0){
            for(int i = 1; i < toThePower; i++){
                number = number * step;
            }
        } else {
            return 1;
        }
        return number;

    }

    @Test
    void checkResult(){
        Assertions.assertEquals(9, toThePower(3, 2));
    }


    @Test
    void CheckZero(){
        Assertions.assertEquals(1, toThePower(2345345, 0));
    }
}
