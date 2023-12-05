package home_work_7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class HundredBooks extends Thread {



    public static void main(String[] args) {
        findWord(getBooks("F:\\programms\\IntelliJ IDEA Educational Edition 2022.2.2\\PROJECTS\\HOMEWORK\\src\\home_work_7\\books"), 72, "и", "F:\\programms\\IntelliJ IDEA Educational Edition 2022.2.2\\PROJECTS\\HOMEWORK\\src\\home_work_7\\words.txt");
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("path: " );
            String path = in.nextLine();
            System.out.println("number: ");
            int num = Integer.parseInt(in.nextLine());
            System.out.println("word: ");
            String word = in.nextLine();
            findWord(getBooks(path), num, word, "F:\\programms\\IntelliJ IDEA Educational Edition 2022.2.2\\PROJECTS\\HOMEWORK\\src\\home_work_7\\words.txt");
        }
    }


    private static ArrayList<String> lines;


    public static List<File> getBooks(String path) {
        File dir = new File(path);
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        return lst;
    }

    public static String readOneBook(String path) {

            try (FileReader reader = new FileReader(path)) {
                Scanner in = new Scanner(reader);
                String f = "";

                while (in.hasNextLine()) {
                    f += in.nextLine();
                }
                return f;
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        return null;
    }

    public static long findWord(List<File> files, int bookNumber, String word, String fileWriteTo) {

        Scanner inp = new Scanner(System.in);
        EasySearch srch = new EasySearch();
        try {
            FileWriter writer = new FileWriter(fileWriteTo, true);
            writer.write(
                    files.get(bookNumber).toString()
                    + " "
                    + word
                    + " "
                    + srch.search(readOneBook(files.get(bookNumber).toString().replace("\\", "\\\\")), word)
                    + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
            return -1;
        }


}
