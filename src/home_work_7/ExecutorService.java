package home_work_7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ExecutorService extends Thread {
    private String path;
    private String word;

    public void setPath(String path) {
        this.path = path;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public void run() {
        try (FileReader reader = new FileReader(path)) {
            Scanner in = new Scanner(reader);
            String fileContent = "";

            while (in.hasNextLine()) {
                fileContent += in.nextLine();
            }

            EasySearch srch = new EasySearch();
            try {
                FileWriter writer = new FileWriter("F:\\programms\\IntelliJ IDEA Educational Edition 2022.2.2\\PROJECTS\\HOMEWORK\\src\\home_work_7\\words.txt", true);
                writer.write(path + " " + word + " " + srch.search(fileContent, word) + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл");
                e.printStackTrace();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}