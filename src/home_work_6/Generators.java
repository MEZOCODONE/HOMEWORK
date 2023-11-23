package home_work_6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Generators {
    private static ArrayList<String> namesFromFile;
    private static String[] petNamesList = {"Дарман", "Эйс", "Аксель", "Макс", "Мики", "Джармуз", "Зейд", "Зухра", "Ислам", "Исмаил", "Курбан", "Лейс", "Мастура", "Мустафа"};
    private static String[] namesList = {"Глубокослав", "Борщ", "Бранимир", "Белослав", "Войцех", "Воротислав", "Градимир", "Дубыня", "Жирослав", "Казимир", "Мирослав", "Ярополк"};
    private static String[] nickNamesList = {"6a6ywka", "k0f3sT", "ΠΘΔΖΣΜΚΛ", "$SImPoTяЖк@$", "CbIpOCTb_oT_HoCkA", "kpendejib_c_caxapom", "_А жИзНь ЧуМаАа_", "Taka9l_3a6aBHa9l"};
    public static String StringGen(int legnth) {
        String letters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnmАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя1234567890@!#$%^&*()";
        String name = "";
        boolean getLetter = false;
        for (int i = 0; i < legnth; i++) {
            name += letters.charAt((int) (Math.random() * letters.length()));
        }
        return name;
    }
    public static String StringGenEng(int legnth) {
        String letters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        String name = "";
        boolean getLetter = false;
        for (int i = 0; i < legnth; i++) {
            name += letters.charAt((int) (Math.random() * letters.length()));
        }
        return name;
    }


    public static String StringGenRu(int legnth) {
        String letters = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String name = "";
        boolean getLetter = false;
        for (int i = 0; i < legnth; i++) {
            name += letters.charAt((int) (Math.random() * letters.length()));
        }
        return name;
    }


    public static String namesFromFile(){
        if(namesFromFile == null){
            try (FileReader reader = new FileReader("src\\home_work_6\\names.txt")) {
                namesFromFile = new ArrayList<>();
                Scanner in = new Scanner(reader);
                while (in.hasNextLine()) {
                    namesFromFile.add(in.nextLine());
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());

            }
        }
        return namesFromFile.get((int)(Math.random()*namesFromFile.size()));

    }

    public static String petnamesFromFile(){
        if(namesFromFile == null){
            try (FileReader reader = new FileReader("src\\home_work_6\\petnames.txt")) {
                namesFromFile = new ArrayList<>();
                Scanner in = new Scanner(reader);
                while (in.hasNextLine()) {
                    namesFromFile.add(in.nextLine());
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());

            }
        }
        return namesFromFile.get((int)(Math.random()*namesFromFile.size()));

    }

    public static String nicknamesFromFile(){
        if(namesFromFile == null){
            try (FileReader reader = new FileReader("src\\home_work_6\\nicknames.txt")) {
                namesFromFile = new ArrayList<>();
                Scanner in = new Scanner(reader);
                while (in.hasNextLine()) {
                    namesFromFile.add(in.nextLine());
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());

            }
        }
        return namesFromFile.get((int)(Math.random()*namesFromFile.size()));

    }





    public static String nickNamesFromList(){
        return petNamesList[(int)(Math.random()* petNamesList.length)];
    }
    public static String NamesFromList(){
        return nickNamesList[(int)(Math.random()* petNamesList.length)];
    }
    public static String petNamesFromList(){
        return namesList[(int)(Math.random()* petNamesList.length)];
    }

    public static void main(String[] args) {
      //  System.out.println(namesFromFile());
      //  System.out.println(nickNamesFromList());
      //  System.out.println(petNamesFromList());
    }
}










