package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Task4_6 {
    public static boolean chechVisnokosnost(int year) {

        if (year%4 == 0){
            return true; //високосный год
        }
        else{
            return false; //не високосный год
        }
    }

    static Task4_6 test = new Task4_6();
    @Test
    void checkTrue(){
        Assertions.assertEquals(true, chechVisnokosnost(84));
    }

    @Test
    void checkFalse(){
        Assertions.assertEquals(false, chechVisnokosnost(82));

    }

}
