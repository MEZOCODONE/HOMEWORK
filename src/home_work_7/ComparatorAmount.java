package home_work_7;

import home_work_6.Pet;

import java.util.Comparator;

public class ComparatorAmount implements Comparator<TierListObject> {

    public int compare(TierListObject o1, TierListObject o2) {
        if(o1.getAmount()>o2.getAmount())
            return 1;
        else if(o1.getAmount()<o2.getAmount())
            return -1;
        else
            return 0;
    }
}
