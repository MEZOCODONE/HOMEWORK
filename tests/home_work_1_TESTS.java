package tests;

import home_work_1.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class home_work_1_TESTS {

    static Task4_1 task4_1 = new Task4_1();
    static Task4_2 task4_2 = new Task4_2();
    static Task4_3 task4_3 = new Task4_3();
    static Task4_4 task4_4 = new Task4_4();
    static Task4_5 task4_5 = new Task4_5();
    static Task4_6 task4_6 = new Task4_6();
    static Task5 task5 = new Task5();
    static Task6_1 task6_1 = new Task6_1();
    static Task6_2 task6_2 = new Task6_2();
    static Task6_3 task6_3 = new Task6_3();
    static Task_7 task7 = new Task_7();

    /////////////TASK 4_1 TEST


    @Test
    void divisionTestEven() {
        assertEquals("Число четное", task4_1.oddEven(20));
    }

    @Test
    void divisionTestOdd() {
        assertEquals("Число нечетное", task4_1.oddEven(15));
    }

    /////////////TASK 4_2 TEST
    @Test
    void testMiddle(){
        assertEquals(15, task4_2.middleDigit(10, 15, 20));
    }

    @Test
    void testWrongInput(){
        assertEquals(null, task4_2.middleDigit(10, 20, 20));
    }

    /////////////TASK 4_3 TEST
    @Test
    void DivisionTrue(){
        Assertions.assertEquals(true, task4_3.DivisionCheck(20, 5));
    }

    @Test
    void DivisionFalse(){
        Assertions.assertEquals(false, task4_3.DivisionCheck(16, 5));
    }

    /////////////TASK 4_4 TEST

    @Test
    void resultByteToKbyte(){
        Assertions.assertEquals(2, task4_4.byteToKbyte(2048));
    }

    @Test
    void resultkByteToByte(){
        Assertions.assertEquals(1024, task4_4.kByteToByte(1));
    }

    /////////////TASK 4_5 TEST

    @Test
    void returnTestTrue(){
        Assertions.assertEquals('E', task4_5.smth((byte) 69));
    }
    /////////////TASK 4_6 TEST
    static Task4_6 test = new Task4_6();
    @Test
    void checkTrue4_6(){
        Assertions.assertEquals(true, task4_6.chechVisnokosnost(84));
    }

    @Test
    void checkFalse4(){
        Assertions.assertEquals(false, task4_6.chechVisnokosnost(82)); }

    /////////////TASK 5 TEST
    @Test
    void checkTrue5(){
        Assertions.assertEquals(true, task5.sleep(0, 1));
        Assertions.assertEquals(true, task5.sleep(1, 1));
    }

    @Test
    void checkFalse5(){
        Assertions.assertEquals(false, task5.sleep(1, 0));
    }

    /////////////TASK 6_1 TEST
    @Test
    void vasya1(){
        Assertions.assertEquals("Привет\nЯ так долго тебя ждал", task6_1.welcome("Вася"));
    }
    @Test
    void nastya1(){
        Assertions.assertEquals("Я тебя так долго ждал", task6_1.welcome("Анастасия"));
    }
    @Test
    void someone1(){
        Assertions.assertEquals("Добрый день, а вы кто", task6_1.welcome("РШОВЫАРОРЫЩОВПА"));
    }

    /////////////TASK 6_2 TEST
    @Test
    void vasya2(){
        Assertions.assertEquals("Привет\nЯ тебя так долго ждал", task6_2.welcome("Вася"));
    }
    @Test
    void nastya2(){
        Assertions.assertEquals("Я тебя так долго ждал", task6_2.welcome("Анастасия"));
    }
    @Test
    void someone2(){
        Assertions.assertEquals("Ты кто", task6_2.welcome("РШОВЫАРОРЫЩОВПА"));
    }

    /////////////TASK 6_3 TEST
    @Test
    void vasya3(){
        Assertions.assertEquals("Привет\nЯ тебя так долго ждал", task6_3.welcome("Вася"));
    }
    @Test
    void nastya3(){
        Assertions.assertEquals("Я тебя так долго ждал", task6_3.welcome("Анастасия"));
    }
    @Test
    void someone3(){
        Assertions.assertEquals("Добрый день, а вы кто?", task6_3.welcome("РШОВЫАРОРЫЩОВПА"));
    }
    /////////////TASK 7 TEST
    @Test
    void checkNumber(){
        Assertions.assertEquals("(328) 148-8666", task7.phoneNumber("3281488666"));
    }






}
