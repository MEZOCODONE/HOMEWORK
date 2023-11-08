package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Task4_5 {

    public static void main(String[] args) {
        System.out.println(smth((byte) 69));
    }

    public static char smth(byte num){

        if ((num > 64 && num < 91) || (num > 96 && num < 123)) {
            return((char) num);
        } else {
            return((char) num);
        }
    }

    static Task4_5 tast = new Task4_5();

    @Test
    void returnTestTrue(){
        Assertions.assertEquals('E', smth((byte) 69));
    }
}