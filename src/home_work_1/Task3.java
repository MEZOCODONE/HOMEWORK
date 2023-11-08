package home_work_1;

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {

        double c, k, a, t, pi;
        pi = 3.14;
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();

        c = Math.cbrt(Math.log10(1/Math.abs(Math.cos(x))) + Math.pow(y, 2));
        System.out.println(c);
        k = Math.cbrt(Math.pow(Math.cos(x), 2) + Math.abs(Math.pow(Math.sin(c), 2)));
        System.out.println(k);
        a = Math.pow(3, -c) * ((Math.sin(pi) * k) / (pi * k));
        System.out.println(a);
        t = c - a * Math.exp(-3) + Math.atan(k);
        System.out.println(t);
    }
}
