package home_work_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HOME_WORK_7_TEST {

    @Test
    void searchTest(){
        String str = "Мама мыла мыла мыла раму";
        EasySearch srch = new EasySearch();
        Assertions.assertEquals(3, srch.search(str, "мыла"));
    }

}
