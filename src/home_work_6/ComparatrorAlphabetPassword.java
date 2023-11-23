package home_work_6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatrorAlphabetPassword implements Comparator<Person> {

    public int compare(Person o1, Person o2){
        ComparatorPassword compPSWRD = new ComparatorPassword();
        ComparatorAlphabet compAlpha = new ComparatorAlphabet();
        if(compPSWRD.compare(o1, o2) != 0){
            return compPSWRD.compare(o1, o2);
        }
        return compAlpha.compare(o1, o2);
    }

}
