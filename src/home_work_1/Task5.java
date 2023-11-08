package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5 {
    public static boolean sleep(int workday, int vacation) {
        boolean goBackSleep;

        String out = "";

        if (workday == 0) {
            out += "Сегодня выходной ";
        } else {
            out += "Сегодня рабочий день ";
        }
        if (vacation == 1) {
            out += ("У нас отпуск");
        } else {
            out += ("У нас не отпуск");
        }

        if (workday == 0 | vacation == 1) {
            out += ("Спим");
            return true;

        } else {
            out += ("Подъем");
            return false;

        }

    }
    static Task5 test = new Task5();

    @Test
    void checkTrue(){
        Assertions.assertEquals(true, sleep(0, 1));
        Assertions.assertEquals(true, sleep(1, 1));
    }

    @Test
    void checkFalse(){
        Assertions.assertEquals(false, sleep(1, 0));
    }
}

