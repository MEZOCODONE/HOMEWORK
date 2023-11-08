package home_work_2.Utils;
import java.util.Arrays;

public class RandArrayTest {
    public static void main(String[] args) {
        int[] container = ArrayUtils.arrayRandom(5, 100, 0);
        System.out.println(Arrays.toString(container));
    }
}
