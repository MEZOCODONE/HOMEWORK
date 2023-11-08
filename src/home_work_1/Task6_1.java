package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;


public class Task6_1 implements ICommunicationPrinter {

    public static void main(String[] args) {
        ICommunicationPrinter task1 = new Task6_1();

    }

    public String welcome(String name) {
        if (Objects.equals(name, "Вася")) {
            return ("Привет\nЯ так долго тебя ждал");
        }
        if (Objects.equals(name, "Анастасия")) {
            return "Я тебя так долго ждал";
        } else
            return "Добрый день, а вы кто";
    }


    @Test
    void vasya(){
        Assertions.assertEquals("Привет\nЯ так долго тебя ждал", welcome("Вася"));
    }
    @Test
    void nastya(){
        Assertions.assertEquals("Я тебя так долго ждал", welcome("Анастасия"));
    }
    @Test
    void someone(){
        Assertions.assertEquals("Добрый день, а вы кто", welcome("РШОВЫАРОРЫЩОВПА"));
    }
}
