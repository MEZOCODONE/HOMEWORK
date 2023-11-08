package home_work_2.Loops;

/*      1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
        Пользователь обязан ввести целое число.
        Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные. */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class task1_2 {

    public static boolean symbol(String userInput) {
        return userInput != null && userInput.matches("^[a-zA-Z]*$");   //Проверка на символы

    }

    public static boolean notInt(String userInput) {
        return userInput.contains(",") || userInput.contains("."); //Проверка на целое число
    }

    public static void digitCheck(String userInput) {
        if (symbol(userInput) == true) {
            System.out.println("Введено не число");
            System.exit(0);
        }
    }

    public static void symbolCheck(String userInput) {
        if (notInt(userInput) == true) {
            System.out.println("Введено не целое число");
            System.exit(0);
        }
    }


    public static int smth(String userInput) {


        int number = Integer.parseInt(userInput);       //Переводим ввод в число


        String numberString = Integer.toString(number);
        char[] charArray = numberString.toCharArray();

        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }

        System.out.println(Arrays.toString(intArray));
        int f = 1;

        for (int i = 0; i < intArray.length; i++) {

            f = f * (intArray[i]);
        }
        return f;

    }

    @Test
    void checkSymbolTrue(){
        Assertions.assertEquals(true, symbol("dgssrg"));
    }

    @Test
    void checkNotIntTrue(){
        Assertions.assertEquals(true, notInt("133,7"));
    }

    @Test
    void checkResult(){
        Assertions.assertEquals(48, smth("328"));
    }
}
