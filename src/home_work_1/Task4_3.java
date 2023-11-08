package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
public class Task4_3 {

    static boolean DivisionCheck(int numDividend, int numDivider) {

        if (numDividend % numDivider == 0) {
            return true;
        } else {
            return false;
        }
    }

    static Task4_3 init = new Task4_3();

    @Test
    void DivisionTrue(){
        Assertions.assertEquals(true, init.DivisionCheck(20, 5));
    }

    @Test
    void DivisionFalse(){
        Assertions.assertEquals(false, init.DivisionCheck(16, 5));
    }
}
