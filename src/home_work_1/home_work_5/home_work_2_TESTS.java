package home_work_5;

import home_work_2.Arrays.ArraysIteration;
import home_work_2.Arrays.task2_4;
import home_work_2.Utils.SortUtils;
import home_work_2.Loops.task1_1_1;
import home_work_2.Loops.task1_1_2;
import home_work_2.Loops.task1_2;
import home_work_2.Loops.task1_3;
import home_work_2.Loops.task1_4;
import home_work_2.Loops.task1_5;
import home_work_2.Loops.task1_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class home_work_2_TESTS {
    ArraysIteration arraysIteration = new ArraysIteration();
    task2_4 task2_4 = new task2_4();
    SortUtils sortUtils = new SortUtils();
    task1_1_1 task1_1_1 = new task1_1_1();
    task1_1_2 task1_1_2 = new task1_1_2();
    task1_2 task1_2 = new task1_2();
    task1_3 task1_3 = new task1_3();
    task1_4 task1_4 = new task1_4();
    task1_5 task1_5 = new task1_5();
    task1_6 task1_6 = new task1_6();


    //////TASK1_1_1 TEST
    @Test
    void checkDigit(){
        Assertions.assertEquals(6, task1_1_1.smth(3));
    }

    //////TASK1_1_2 TEST
    @Test
    void inNotZero(){
        Assertions.assertEquals(6, task1_1_2.factorial(3));
    }
    @Test
    void inEqualsZero(){
        Assertions.assertEquals(1, task1_1_2.factorial(0));
    }

    //////TASK1_2 TEST
    @Test
    void checkSymbolTrue(){
        Assertions.assertEquals(true, task1_2.symbol("dgssrg"));
    }

    @Test
    void checkNotIntTrue(){
        Assertions.assertEquals(true, task1_2.notInt("133,7"));
    }

    @Test
    void checkResult(){
        Assertions.assertEquals(48, task1_2.smth("328"));
    }

    //////TASK1_3 TEST
    @Test
    void checkResult1_3(){
        Assertions.assertEquals(9, task1_3.toThePower(3, 2));
    }

    @Test
    void CheckZero(){
        Assertions.assertEquals(1, task1_3.toThePower(2345345, 0));
    }

    //////TASK1_5 TEST
    @Test
    void testFibonachi() {
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233}, task1_5.fibonacci(12));
    }

    @Test
    void testMaxDigit() {
        Assertions.assertEquals(5, task1_5.maxDigit(1345));
    }

    @Test
    void testOddEven() {
        Assertions.assertArrayEquals(new int[]{5, 5}, task1_5.oddEven(1379366666));
    }

    @Test
    void testProbOfEven() {
        Assertions.assertEquals(true, 60.0 > task1_5.probOfEven() && task1_5.probOfEven() > 40.0);
    }

    @Test
    void testRangeNstep() {
        Assertions.assertArrayEquals(new int[]{10, 20, 30, 40, 50}, task1_5.rangeNstep(10, 50, 10));
    }

    @Test
    void testReverseString() {
        Assertions.assertEquals("qwerty", task1_5.reverseString("ytrewq"));
    }

    //////TASK1_6 TEST
    @Test
    void testMultiplication(){
        Assertions.assertEquals("1 x 2 = 2", task1_6.multiplication()[1]);
    }

    //////TASK2_4 TEST
    @Test
    void testEvensSum() {
        Assertions.assertEquals(12, task2_4.evensSum(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    void testFindMaxEvenIn() {
        Assertions.assertEquals(16, task2_4.findMaxEvenIn(new int[]{16, 2, 3, 4, 7, 12}));
    }

    @Test
    void testLessAverage() {
        Assertions.assertArrayEquals(new int[]{2, 3, 4}, task2_4.lessAverage(new int[]{16, 2, 3, 4, 7, 12}));
    }

    @Test
    void testOut2Lest() {
        Assertions.assertArrayEquals(new int[]{-5, 1}, task2_4.out2Least(new int[]{1, 2, 3, 4, -5, 6, 7}));
    }

    @Test
    void testCutArray() {
        Assertions.assertArrayEquals(new int[]{1,2,3}, task2_4.cutArray(new int[]{1, 2, 3, 4, 5, 6}, 4, 6));
    }
    @Test
    void testSumArrayDigits(){
        Assertions.assertEquals(18, task2_4.sumArrDigits(new int[]{1,2,3,4,5,12}));
    }
    //////ArraysIterationTest
    @Test
    void arrayTest(){
        for(int i = 0; i < 4; i++) {
            Assertions.assertEquals("1 2 3 4 5 ", arraysIteration.allOutput(new int[]{1, 2, 3, 4, 5})[i]);
            Assertions.assertEquals("2 4 ", arraysIteration.everySecondEl(new int[]{1, 2, 3, 4, 5})[i]);
            Assertions.assertEquals("5 4 3 2 1 ", arraysIteration.arrayReverse(new int[]{1, 2, 3, 4, 5})[i]);
        }
    }
    //////SORTUTILS TEST
    @Test
    void bubbleTest(){
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, SortUtils.sort(new int[]{6,2,1,3,5,4}));
    }
    @Test
    void shakeTest(){
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, SortUtils.shake(new int[]{6,2,1,3,5,4}));
    }
}
