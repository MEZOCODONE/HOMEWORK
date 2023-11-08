package home_work_2.Arrays;

import home_work_2.Utils.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class task2_4 {

    public static int[] randomArray(int size, int maxValueExclusion, int minValueExclusion) {
        return ArrayUtils.arrayRandom(size, maxValueExclusion, minValueExclusion);
    }

    public static int evensSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    public static int findMaxEvenIn(int[] array) {
        int[] arrayEven = new int[array.length / 2];
        int j = 0;
        for (int i = 0; i < array.length; i += 2) {
            arrayEven[j] = array[i];
            j++;
        }
        int bufMax = -2147483648;
        for (int i = 0; i < arrayEven.length; i++) {

            if (bufMax <= arrayEven[i]) {
                bufMax = arrayEven[i];
            }
        }
        return bufMax;
    }

    public static int[] lessAverage(int[] array) {
        int sumAll = 0;
        for (int el : array) {
            sumAll = sumAll + el;
        }
        int average = sumAll / array.length;
        int z = 0;
        for (int el : array) {
            if (el < average) {
                z++;
            }
        }
        int[] out = new int[z];
        z = 0;
        for (int el : array) {
            if (el < average) {
                out[z] = el;
                z++;
            }
        }
        return out;
    }

    public static int[] out2Least(int[] array) {
        int least = Integer.MAX_VALUE;
        int j = 0;
        int[] out = new int[2];
        for (int el : array) {
            if (el < least) {
                least = el;
            }

        }
        out[0] = least;
        for (int i = 0; i < array.length; i++) {
            if (least == array[i]) {
                array[i] = Integer.MAX_VALUE;
                break;
            }
        }
        least = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < least) {
                least = el;
            }

        }
        out[1] = least;


        return out;
    }

    public static int[] cutArray(int[] array, int min, int max) {

        Integer[] buff = new Integer[array.length];
        int nul = 0;
        for(int i =0; i< array.length; i++){
            if(min<=array[i] && array[i]<=max){
                buff[i] = null;
                nul++;
            }else{
                buff[i] = array[i];
            }
        }
        int[] buff2 = new int[array.length-nul];
        int z =0;
        for (int i = 0; i < buff.length;i++){
            if(buff[i] != null){
                buff2[z] = buff[i];
                z++;
            }
        }
        return buff2;
    }

    public static int sumArrDigits(int[] array) {
        int remain = 0;
        int sum = 0;
        for (int el : array) {
            while (el != 0) {
                remain = el % 10;
                el /= 10;
                sum = sum + remain;
            }
        }
        return sum;
    }


    @Test
    void testEvensSum() {
        Assertions.assertEquals(12, evensSum(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    void testFindMaxEvenIn() {
        Assertions.assertEquals(16, findMaxEvenIn(new int[]{16, 2, 3, 4, 7, 12}));
    }

    @Test
    void testLessAverage() {
        Assertions.assertArrayEquals(new int[]{2, 3, 4}, lessAverage(new int[]{16, 2, 3, 4, 7, 12}));
    }

    @Test
    void testOut2Lest() {
        Assertions.assertArrayEquals(new int[]{-5, 1}, out2Least(new int[]{1, 2, 3, 4, -5, 6, 7}));
    }

    @Test
    void testCutArray() {
        Assertions.assertArrayEquals(new int[]{1,2,3}, cutArray(new int[]{1, 2, 3, 4, 5, 6}, 4, 6));
    }
    @Test
    void testSumArrayDigits(){
        Assertions.assertEquals(18, sumArrDigits(new int[]{1,2,3,4,5,12}));
    }


}
