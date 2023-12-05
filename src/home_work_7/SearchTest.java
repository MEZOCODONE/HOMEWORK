package home_work_7;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchTest {
    public static void main(String[] args) {
        find();
    }

    public static void find() {
        String f = "";
        try (FileReader reader = new FileReader("src\\home_work_7\\Война и мир_книга.txt")) {
            Scanner in = new Scanner(reader);

            while (in.hasNextLine()) {
                f+=in.nextLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        EasySearch es = new EasySearch();
        System.out.println(es.search(f, " и ") + es.search(f, ". И ") + es.search(f, ", и "));
        System.out.println(es.search(f, "Война ") + es.search(f, "война"));
        System.out.println(es.search(f, " мир ") + es.search(f, "Мир ") + es.search(f, " Мир "));

    }
}
