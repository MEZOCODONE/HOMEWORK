package home_work_1;

import java.util.Scanner;




public class Task_8 {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString(); //реверс строки
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double i = in.nextDouble(); //число которое переводим в двоичный код
        double o;

        if (i > 0) { //случай если наше число положительное

            o = i % 2;                    //один разок прокручиваем остаток вне цикла чтобы не было проблем со строкой
            i = Math.floor(i / 2);      //округляем до !!!МЕНЬШЕГО!!! то что получилось при делении
            String oStr = Double.toString(o).replace(".0", "");      /* инициализируем один раз строку
                                                                                       и сразу же её красиво фильтруем
                                                                                         от лишних нулей дабла */
            while (i != 0) {         //сам цикл
                o = i % 2;            // остаток от деления
                i = Math.floor(i / 2); //округляем то что поделили до меньшего
                oStr = oStr + Double.toString(o).replace(".0", ""); /*добавляем к строке новый остаток
                                                                                светлый фильтрованный*/
            }
            oStr = reverseString(oStr); //реверсим строку
            System.out.println(oStr);//выводим число


        } else {


            o = i % 2;                    //один разок прокручиваем остаток вне цикла чтобы не было проблем со строкой
            i = Math.ceil(i / 2);      //округляем до !!!БОЛЬШЕГО!!! то что получилось при делении
            String oStr = Double.toString(Math.abs(o)).replace(".0", "");      /* инициализируем один раз строку
                                                                                  //     и сразу же её красиво фильтруем
                                                                                    //     от лишних нулей дабла */
            while (i != 0) {         //сам цикл
                o = i % 2;            // остаток от деления
                i = Math.ceil(i / 2); //округляем то что поделили до большего
                oStr = oStr + Double.toString(Math.abs(o)).replace(".0", ""); /*добавляем к строке новый остаток
                                                                               // светлый фильтрованный*/
            }
            if (oStr.length() % 4 != 0) {
                oStr = "0" + oStr;
            }
            oStr = reverseString(oStr.replace("1", "k").replace("0", "1").replace("k", "0"));
            System.out.println(oStr + "+ 1"); //выводим число
/*
            char[] arrDigitsMassive = oStr.toCharArray();
            System.out.println("Создаем массив");
            System.out.println(arrDigitsMassive);
            //  char f = '1';
            char zero = '0';
            int k = arrDigitsMassive.length;
            boolean r = !Objects.equals(arrDigitsMassive[k - 1], zero);

            while (r == true) {
                r = !Objects.equals(arrDigitsMassive[k - 1], zero);
                System.out.println("Не ноль");
                k--;

            }
             System.out.println("ПОПАЛИ НА 0"); */
        }
    }
}