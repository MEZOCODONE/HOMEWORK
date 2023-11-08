package home_work_2.Arrays;

import home_work_2.Utils.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.String;

public class ArraysIteration implements IArraysOperation {

    public int[] arrayFromConsole(){

        return ArrayUtils.arrayFromConsole();
    }
    public String[] allOutput(int[] array) {
        int i = 0;
        String[] out = new String[4];
        out[0] = "";
        out[1] = "";
        out[2] = "";
        out[3] = "";
        do {
            out[0] += array[i] + " ";
            i += 1;
        } while (i < array.length);

        i = 0;

        while (i < array.length) {
            out[1] += array[i] + " ";
            i++;
        }
        for (i = 0; i < array.length; i++) {
            out[2] += array[i] + " ";
        }
        for (int el : array) {
            out[3] += el + " ";
        }

        return out;
    }

    public String[] everySecondEl(int[] array) {
        int step = 2;
        int i = 1;
        String[] out = new String[4];
        out[0] = "";
        out[1] = "";
        out[2] = "";
        out[3] = "";
        do {
            out[0] += array[i] + " ";
            i += step;
        } while (i < array.length);

        i = 1;
        while (i < array.length) {
            out[1] += array[i] + " ";
            i += step;
        }
        for (i = 1; i < array.length; i += step) {
            out[2] += array[i] + " ";
        }

        i = 1;
        for (int el : array) {
            if (i % step != 1) {
                out[3] += el + " ";
            }
            i++;
        }

        return out;
    }

    public String[] arrayReverse(int[] array) {
        String[] out = new String[4];
        out[0] = "";
        out[1] = "";
        out[2] = "";
        out[3] = "";

        int i = array.length - 1;
        do {
            out[0] += array[i] + " ";
            i -= 1;
        } while (i > -1);

        i = array.length - 1;
        while (i > -1) {
            out[1] += array[i] + " ";
            i -= 1;
        }
        for (i = array.length - 1; i > -1; i -= 1) {
            out[2] += array[i] + " ";
        }

        i = array.length - 1;
        while (i > -1) {
            for (int el : array) {
                if (el == array[i]) {
                    out[3] += array[i] + " ";
                }
            }
            i--;
        }

        return out;
    }

    @Test
    void arrayTest(){
        for(int i = 0; i < 4; i++) {
            Assertions.assertEquals("1 2 3 4 5 ", allOutput(new int[]{1, 2, 3, 4, 5})[i]);
            Assertions.assertEquals("2 4 ", everySecondEl(new int[]{1, 2, 3, 4, 5})[i]);
            Assertions.assertEquals("5 4 3 2 1 ", arrayReverse(new int[]{1, 2, 3, 4, 5})[i]);
        }
    }

}
