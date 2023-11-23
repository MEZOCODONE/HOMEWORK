package home_work_6;

import java.util.*;
import java.util.function.Supplier;
import java.util.Iterator;
import java.util.List;
public class ObjectGenerators {


    public static Person personGen() {
        Person buff = new Person();
        buff.setName(Generators.namesFromFile());
        buff.setNick(Generators.StringGenEng((int) (Math.random() * 10)));
        buff.setPassword(Generators.StringGen(16));
        return buff;
    }

    //  6.2.1. LinkedList
//		6.2.2. ArrayList
//		6.2.3. HashSet
//		6.2.4. TreeSet
    public static <T> List<T> objGen(int Linked_0_Array_1, Supplier<T> supplier) {
        List<T> out = null;
        switch (Linked_0_Array_1) {
            case 0:
                out = new LinkedList<>();
                break;
            case 1:
                out = new ArrayList<>();
                break;
        }
        for (int i = 0; i < 1_000_000; i++) {
            T obj = supplier.get();
            out.add(obj);
        }
        return out;
    }

    public static <T> HashSet<T> objGen(Supplier<T> supplier) {
        HashSet<T> out = new HashSet<>();
        for (int i = 0; i < 1_000_000; i++) {
            T obj = supplier.get();
            out.add(obj);
        }
        return out;
    }

    public static <T> TreeSet<T> treeGen(Supplier<T> supplier) {
        TreeSet<T> out = new TreeSet<>();
        for (int i = 0; i < 1_000_000; i++) {
            T obj = supplier.get();
            out.add(obj);
        }
        return out;
    }

    public static List<Person> sort(List<Person> someArray){
        int size = someArray.size();
        ComparatrorAlphabetPassword comp = new ComparatrorAlphabetPassword();
        for(int i = 0; i < size - 1; i++){
            for(int j = (size - 1); j > i; j--){
                if (comp.compare(someArray.get(j-1), someArray.get(j)) == 1){
                    Person temp = someArray.get(j - 1);
                    someArray.set(j - 1, someArray.get(j));
                    someArray.set(j, temp);
                }
            }
        }
        return someArray;
    }

}


