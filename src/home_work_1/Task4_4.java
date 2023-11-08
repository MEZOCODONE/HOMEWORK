package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Task4_4 {

    public static float byteToKbyte (float amBytes){
        float amKiloBytes;
        amKiloBytes = amBytes / 1024;
        return amKiloBytes;


    }

    public static float kByteToByte(float amKiloBytes){
        float amBytes;
        amBytes = amKiloBytes * 1024;
        return amBytes;

    }
    static Task4_4 test = new Task4_4();

    @Test
    void resultByteToKbyte(){
        Assertions.assertEquals(2, byteToKbyte(2048));
    }

    @Test
    void resultkByteToByte(){
        Assertions.assertEquals(1024, kByteToByte(1));
    }

}
