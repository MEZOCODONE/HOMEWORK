package home_work_1;

public class Task6_main {
    public static void main(String[] args) {
        ICommunicationPrinter task1 = new Task6_1();
        ICommunicationPrinter task2 = new Task6_2();
        ICommunicationPrinter task3 = new Task6_3();

        System.out.println(task1.welcome("Вася"));
        System.out.println(task1.welcome("Анастасия"));
        System.out.println(task1.welcome("кто-то"));
        System.out.println(task2.welcome("Вася"));
        System.out.println(task2.welcome("Анастасия"));
        System.out.println(task2.welcome("кто-то"));
        System.out.println(task3.welcome("Вася"));
        System.out.println(task3.welcome("Анастасия"));
        System.out.println(task3.welcome("кто-то"));

    }
}
