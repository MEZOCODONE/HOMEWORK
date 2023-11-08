package home_work_2.Utils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] test1 = new int[]{1,2,3,4,5,6};
        int[] test2 = new int[]{1,1,1,1};
        int[] test3 = new int[]{9,1,5,99,9,9};
        int[] test4 = new int[]{};
        int[] test5 = new int[]{6,5,4,3,2,1};
        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(test1));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(test1)));

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(test2));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(test2)));

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(test3));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(test3)));

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(test4));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(test4)));

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(test5));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(test5)));


        System.out.println("---------------------------------------\nКонсольная сортировка\n---------------------------------------");
        int[] consoleArr = ArrayUtils.arrayFromConsole();
        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(consoleArr));
        System.out.println(Arrays.toString(SortUtils.sort(consoleArr)));
        System.out.println("Конец консольной сортировки\n---------------------------------------");
        System.out.println("\n---------------------------------------\nСортировка рандомом\n---------------------------------------");

        int[] randArr = ArrayUtils.arrayRandom(20, 100,0);
        System.out.println(Arrays.toString(SortUtils.sort(randArr))); ;
        System.out.println("---------------------------------------\nКонец сортировки рандомом\n---------------------------------------");

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(test1));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(test1)));

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(test2));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(test2)));

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(test3));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(test3)));

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(test4));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(test4)));

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(test5));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(test5)));


        System.out.println("---------------------------------------\nКонсольная сортировка\n---------------------------------------");
        int[] console2Arr = ArrayUtils.arrayFromConsole();
        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(console2Arr));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(console2Arr)));
        System.out.println("Конец консольной сортировки\n---------------------------------------");
        System.out.println("\n---------------------------------------\nСортировка рандомом\n---------------------------------------");

        int[] rand2Arr = ArrayUtils.arrayRandom(20, 100,0);
        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(rand2Arr));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(SortUtils.sort(rand2Arr)));
        System.out.println("---------------------------------------\nКонец сортировки рандомом");

    }
}
