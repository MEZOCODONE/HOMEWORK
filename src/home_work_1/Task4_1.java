package home_work_1;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Task4_1 {


    public String oddEven(int digit){

        if (digit % 2 == 0) {
            return("Число четное");
        } else {
            return("Число нечетное");
        }
    }

    static Task4_1 method = new Task4_1();

    @Test
    void divisionTestEven_1() {
        assertEquals("Число четное", method.oddEven(21)); }

    @Test
    void divisionTestEven_2() {
        assertEquals("Число четное", method.oddEven(20));
    }

    @Test
    void divisionTestOdd() {
        assertEquals("Число нечетное", method.oddEven(15));}
}

