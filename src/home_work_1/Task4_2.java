package home_work_1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4_2 {


    public Integer middleDigit(int a, int b, int c){
        int minVal = Math.min(Math.min(a, b), c); //выбираем минимальное число
        int maxVal = Math.max(Math.max(a, b), c); //выбираем максимальное
        int midVal = a + b + c - minVal - maxVal; //отнимаем от суммы всех чисел минимальное и максимальное значения
        if(a == b || a == c || b == c){
            return null;
        }
        else {
            return midVal;
        }
    }


    static Task4_2 init = new Task4_2();

    @Test
    void testMiddle(){
        assertEquals(15, init.middleDigit(10, 15, 20));
    }

    @Test
    void testWrongInput(){
        assertEquals(null, init.middleDigit(10, 20, 20));
    }

}

