package home_work_7;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class wordList implements ISearchEngine {

    private static ArrayList<String> lines;

    public static void main(String[] args) {
        wordList tester = new wordList();
        long start = System.currentTimeMillis();
        //System.out.println(tester.search("src\\home_work_7\\Война и мир_книга.txt", "и") + tester.search("src\\home_work_7\\Война и мир_книга.txt", "И"));
        System.out.println(topWordsFromFileMap(3));
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    public static void fileChecker(String path) {
        if (lines == null) {
            try (FileReader reader = new FileReader(path)) {
                lines = new ArrayList<>();
                Scanner in = new Scanner(reader);

                while (in.hasNextLine()) {
                    lines.add(in.nextLine());
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());

            }
        }
    }



    public static HashSet<String> uniqueWordsFromFile() {
        HashSet<String> words = new HashSet<>();
        fileChecker("src\\home_work_7\\Война и мир_книга.txt");
        words = new HashSet<>();
        String line = "";
        String word = "";
        for (int i = 0; i < lines.size(); i++) {
            line = lines.get(i);
            line = line.replaceAll("\\p{P}", "");
            lines.set(i, line);
            String[] wordsArray = lines.get(i).split("\\s+");
            words.addAll(Arrays.asList(wordsArray));
        }
        words.removeIf(String::isEmpty);
        return words;
    }

   /* public static String topWordsFromFile(int amount) {
        List<String> allWords = new ArrayList<>();
        fileChecker();                          //проверяем был ли инициализирован текстовый документ в лист строк
        String line = "";
        String word = "";
        for (int i = 0; i < lines.size(); i++) {
            line = lines.get(i);
            line = line.replaceAll("\\p{P}", "");
            lines.set(i, line);
            String[] wordsArray = lines.get(i).split("\\s+");
            allWords.addAll(Arrays.asList(wordsArray));
        }
        allWords.removeIf(String::isEmpty);
        int counter = 0;
        List<TierListObject> topWords = new ArrayList<>();
        for(String el : uniqueWordsFromFile()){
            counter = 0;
            for(int i = 0; i < allWords.size(); i++){
                if(el.equals(allWords.get(i))){
                    counter++;
                }
            }
            TierListObject someWord = new TierListObject();
            someWord.setWord(el);
            someWord.setAmount(counter);
            topWords.add(someWord);

        }
        Collections.sort(topWords, new ComparatorAmount());
        String output = "";
        for(int i = 1; i <= amount; i++){
            output += topWords.get(topWords.size() - i).getWord() + " " + topWords.get(topWords.size() - i).getAmount() + "\n";
        }
        return output;
    } */

    public static String topWordsFromFileMap(int amount) {
        List<String> allWords = new ArrayList<>();
        fileChecker("src\\home_work_7\\Война и мир_книга.txt");                          //проверяем был ли инициализирован текстовый документ в лист строк
        String line = "";
        String word = "";
        for (int i = 0; i < lines.size(); i++) {
            line = lines.get(i);
            line = line.replaceAll("\\p{P}", "");
            lines.set(i, line);
            String[] wordsArray = lines.get(i).split("\\s+");
            allWords.addAll(Arrays.asList(wordsArray));
        }
        allWords.removeIf(String::isEmpty);
        int counter = 0;
        Map<String, Integer> topWordsMap = new TreeMap<>();
        for (String el : uniqueWordsFromFile()) {
            counter = 0;
            for (int i = 0; i < allWords.size(); i++) {
                if (el.equals(allWords.get(i))) {
                    counter++;
                }
            }
            topWordsMap.put(el, counter);
        }
        Set<Map.Entry<String, Integer>> set = topWordsMap.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        String output = "";
        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {
            if (count < amount) {
                output += entry.getKey() + ": " + entry.getValue() + "\n";
                count++;
            } else {
                break;
            }
        }
        return output;
    }


    @Override
    public long search(String text, String word) {
        fileChecker(text);
        List<String> allWords = new ArrayList<>();
        String line = "";
        for (int i = 0; i < lines.size(); i++) {
            line = lines.get(i);
            line = line.replaceAll("\\p{P}", "");
            lines.set(i, line);
            String[] wordsArray = lines.get(i).split("\\s+");
            allWords.addAll(Arrays.asList(wordsArray));
        }
        allWords.removeIf(String::isEmpty);
        int counter = 0;
        for (int i = 0; i < allWords.size(); i++) {
            if (word.equals(allWords.get(i))) {
                counter++;
            }
        }
        return counter;
    }



}
