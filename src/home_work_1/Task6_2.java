package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Task6_2 implements ICommunicationPrinter {

        public String welcome (String name){
            switch (name) {
                case "Вася":
                    return ("Привет\nЯ тебя так долго ждал");
                case "Анастасия":
                    return ("Я тебя так долго ждал");
                default:
                    return ("Ты кто");
            }

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
        Assertions.assertEquals("Ты кто", welcome("РШОВЫАРОРЫЩОВПА"));
    }
    }

