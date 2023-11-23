package home_work_6;

import java.util.Comparator;

public class ComparatorAlphabet implements Comparator<Person> {

    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    @Override
    public int compare(Person o1, Person o2) {
        int out = 0;
        for (int i = 0; i < Math.min(o1.getName().length(), o2.getName().length()); i++) {
            if (o1.getName().charAt(i) > o2.getName().charAt(i)) {
                out = 1;
                break;
            } else if (o1.getName().charAt(i) < o2.getName().charAt(i)) {
                out = -1;
                break;
            }
        }
        return out;
    }
}
