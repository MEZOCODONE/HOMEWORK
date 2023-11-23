package home_work_6;

import java.util.Comparator;

public class ComparatorAlphabetAge implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2){
        ComparatorAge compAge = new ComparatorAge();
        ComparatorPetAlphabet compAlpha = new ComparatorPetAlphabet();
        if(compAge.compare(o1, o2) != 0){
            return compAge.compare(o1, o2);
        }
        return compAlpha.compare(o1, o2);
    }

}
