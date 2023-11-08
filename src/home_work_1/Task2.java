package home_work_1;

public class Task2 {
    public static void main(String[] args) {
        int a = 8, b = 0, k = 0, f = 2;
        boolean g;

        b = 5 + 2 / a;              //всё исправно работает
        System.out.println(b);

        b = (5 + 2) / a;            //всё исправно работает
        System.out.println(b);

        b = (5 + f++) / a;          //требовалась инкрементация 2++ (инкрементация "2" была необязательной)
        System.out.println(b);

        b = (5 + f++) / --a;        //требовалась инкрементация 2++ (инкрементация "--2" была обязательной)
        System.out.println(b);

        b = (5 * 2 >> f++) / --a;   //требовалась инкрементация 2++ и --2
        System.out.println(b);

        k = (5 + 7 > 20 ? 68 : 22 * 2 >> f++) / --a; //требовалась инкрементация 2++ и --2
        System.out.println(k);

        g = (6 - 2 > 3 && 12 * 12 <= 119); //требовалось добавить скобки
        System.out.println(g);

        g =  true && false; // ничего не нужно исправлять
        System.out.println(g);

    }
}
