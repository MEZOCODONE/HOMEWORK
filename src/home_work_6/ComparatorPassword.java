package home_work_6;
import java.util.Comparator;


public class ComparatorPassword implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getPassword().length()>o2.getPassword().length())
            return 1;
        else if(o1.getPassword().length()<o2.getPassword().length())
            return -1;
        else
            return 0;
    }

}
