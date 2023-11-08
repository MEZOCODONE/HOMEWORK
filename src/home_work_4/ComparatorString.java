package home_work_4;

import java.util.Comparator;

class ComparatorString implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {
        if(o1.length()>o2.length())
            return 1;
        else if(o1.length()<o2.length())
            return -1;
        else
            return 0;
    }
}