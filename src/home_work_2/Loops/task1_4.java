package home_work_2.Loops;

/*  1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до переполнения и после переполнения. */

import java.util.Scanner;

public class task1_4 {
    public static void main(String[] args) {
        dicks(6);
    }

    public static void dicks(int multiplier) {
        Scanner in = new Scanner(System.in);

        long after = -1;
        long before = 1;
        int mnogo = Integer.MAX_VALUE;
        for (int i = 0; i < mnogo; i++) {
            before = after;
            if (Long.MAX_VALUE - Math.abs(after) < Math.abs(after * multiplier)) {
                break;
            }
            after = after * (multiplier);
        }
        System.out.println(before);
        System.out.println(after);

    }
}

