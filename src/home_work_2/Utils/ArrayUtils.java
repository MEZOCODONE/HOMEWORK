package home_work_2.Utils;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class ArrayUtils {
    public static int[] arrayFromConsole() {
        Scanner arrFill = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrSize = arrFill.nextInt();
        int[] array = new int[arrSize];
        System.out.println(Arrays.toString(array));
        System.out.println("Заполните массив " + arrSize + " элементами");
        for (int i = 0; i < array.length; i++) {
            array[i] = arrFill.nextInt();
            System.out.println(Arrays.toString(array));
        }
        return array;

    }

    public static int[] arrayRandom(int size, int maxValueExclusion, int minValueExclusion) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int[] randArray = new int[size];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = rnd.nextInt(maxValueExclusion - minValueExclusion + 1) + minValueExclusion;
        }
        System.out.println("Создан массив: ");
        System.out.println(Arrays.toString(randArray));
        return randArray;
    }
}
