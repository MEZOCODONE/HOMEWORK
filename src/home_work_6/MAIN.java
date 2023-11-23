package home_work_6;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import static home_work_6.ObjectGenerators.objGen;
import static home_work_6.ObjectGenerators.treeGen;

public class MAIN {
    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<Person> personSet = treeGen(() -> {
            Person person = new Person();
            person.setName(Generators.namesFromFile());
            person.setNick(Generators.StringGenEng((int) (Math.random() * 10)));
            person.setPassword(Generators.StringGen(16));
            return person;
        });

        long start = System.currentTimeMillis();

        List<Pet> petSet = objGen(1, () -> {
            Pet pet = new Pet();
            pet.setAge(random.nextInt(15) + 1);
            pet.setNick(Generators.petnamesFromFile());
            return pet;
        });

        long end = System.currentTimeMillis();

        System.out.println(end - start);
        //Collections.sort(petSet, new ComparatorAlphabetAge());

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            petSet.remove(i);
            //System.out.println(petSet.size());
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);


    }

}
