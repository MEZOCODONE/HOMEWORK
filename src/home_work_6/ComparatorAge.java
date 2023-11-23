package home_work_6;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        if(o1.getAge()>o2.getAge())
            return 1;
        else if(o1.getAge()<o2.getAge())
            return -1;
        else
            return 0;
    }
}
