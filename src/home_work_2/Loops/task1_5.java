package home_work_2.Loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/*  1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах. */

public class task1_5 {


    public static int[] fibonacci(int amount) {
        int F1 = 0;
        int F2 = 1;
        int buf;
        int[] numList = new int[amount];
        for (int i = 0; i < amount; i++) {
            buf = F1 + F2;
            F1 = F2;
            F2 = buf;
            numList[i] = F2;

        }
        return numList;
    }

    public static int maxDigit(int Number) {
        String arrLength = Integer.toString(Number);

        int[] numArray = new int[arrLength.length()];
        for (int i = 0; i < arrLength.length(); i++) {
            numArray[i] = Number % 10;
            Number = Number / 10;
        }
        return Arrays.stream(numArray).max().getAsInt();

    }

    public static int[] oddEven(int Number) {
        String arrLength = Integer.toString(Number);

        int[] numArray = new int[arrLength.length()];
        for (int i = 0; i < arrLength.length(); i++) {
            numArray[i] = Number % 10;
            Number = Number / 10;
        }
        int[] oddArray = new int[0];
        int[] evenArray = new int[0];
        for (int num : numArray) {
            // System.out.println(num);
            if (num % 2 == 0) {
                int[] newEvenArr = new int[evenArray.length + 1];
                for (int j = 0; j < evenArray.length; j++) {
                    newEvenArr[j] = evenArray[j];
                    // System.out.println(evenArray[i]);
                }
                newEvenArr[newEvenArr.length - 1] = num;
                evenArray = newEvenArr;

            } else {
                int[] newOddArr = new int[oddArray.length + 1];
                for (int j = 0; j < oddArray.length; j++) {
                    newOddArr[j] = oddArray[j];
                    // System.out.println(evenArray[i]);
                }
                newOddArr[newOddArr.length - 1] = num;
                oddArray = newOddArr;

            }
        }
        return new int[]{evenArray.length, oddArray.length};
    }

    public static float probOfEven() {

        Random random = new Random();
        float average = 0;
        int repeats = 10;
        int arraySize = 1000;
        for (int f = 0; f < repeats; f++) {
            int[] oddArray = new int[0];
            int[] evenArray = new int[0];
            int[] numArray = new int[arraySize];

            for (int k = 0; k < numArray.length; k++) {
                numArray[k] = random.nextInt();
            }
            for (int num : numArray) {
                // System.out.println(num);
                if (num % 2 == 0) {
                    int[] newEvenArr = new int[evenArray.length + 1];
                    for (int j = 0; j < evenArray.length; j++) {
                        newEvenArr[j] = evenArray[j];
                        // System.out.println(evenArray[i]);
                    }
                    newEvenArr[newEvenArr.length - 1] = num;
                    evenArray = newEvenArr;

                } else {
                    int[] newOddArr = new int[oddArray.length + 1];
                    for (int j = 0; j < oddArray.length; j++) {
                        newOddArr[j] = oddArray[j];
                        // System.out.println(evenArray[i]);
                    }
                    newOddArr[newOddArr.length - 1] = num;
                    oddArray = newOddArr;

                }
            }
            //System.out.println(Arrays.toString(evenArray));
            float oddL = oddArray.length;
            float oddAll = numArray.length;
            average = average + oddL * 100 / oddAll;
        }
        float averProb = average / repeats;
        return averProb;
    }

    public static int[] rangeNstep(int rangeBegin, int rangeEnd, int step) {
        int[] arr = new int[(rangeEnd - rangeBegin) / step + 1];
        int z = 0;
        for (int i = rangeBegin; i <= rangeEnd; i = i + step) {
            arr[z] = i;
            z++;
        }
        return arr;
    }

    public static String reverseString(String digits) {
        return new StringBuilder(digits).reverse().toString();

    }

    @Test
    void testFibonachi() {
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233}, fibonacci(12));
    }

    @Test
    void testMaxDigit() {
        Assertions.assertEquals(5, maxDigit(1345));
    }

    @Test
    void testOddEven() {
        Assertions.assertArrayEquals(new int[]{5, 5}, oddEven(1379366666));
    }

    @Test
    void testProbOfEven() {
        Assertions.assertEquals(true, 60.0 > probOfEven() && probOfEven() > 40.0);
    }

    @Test
    void testRangeNstep() {
        Assertions.assertArrayEquals(new int[]{10, 20, 30, 40, 50}, rangeNstep(10, 50, 10));
    }

    @Test
    void testReverseString() {
        Assertions.assertEquals("qwerty", reverseString("ytrewq"));
    }
}
