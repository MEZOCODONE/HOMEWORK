package home_work_7;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class ExecutorServiceMain {
    public static void main(String[] args) {
        HundredBooks hnd = new HundredBooks();
        List<File> books = hnd.getBooks("F:\\programms\\IntelliJ IDEA Educational Edition 2022.2.2\\PROJECTS\\HOMEWORK\\src\\home_work_7\\books");

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Input word: ");
            String word = in.nextLine();
            for (int i = 0; i < books.size(); i++) {
                ExecutorService executorService = new ExecutorService();
                executorService.setWord(word);
                executorService.setPath(books.get(i).toString().replace("\\", "\\\\"));
                executorService.start();
            }
        }
    }
}
