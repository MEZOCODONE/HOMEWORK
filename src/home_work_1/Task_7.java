package home_work_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_7 {


    public static String phoneNumber(String number) {
        char[] digitsArray = number.toCharArray(); //конвертируем каждую цифру в элемент массива
        return("(" + digitsArray[0] + digitsArray[1] + digitsArray[2] + ") "
                + digitsArray[3] + digitsArray[4] + digitsArray[5] + "-" + digitsArray[6] + digitsArray[7] + digitsArray[8] + digitsArray[9]); //форматируем
    }

    @Test
    void checkNumber(){
        Assertions.assertEquals("(328) 148-8666", phoneNumber("3281488666"));
    }
}
