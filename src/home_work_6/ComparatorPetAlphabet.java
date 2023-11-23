package home_work_6;

public class ComparatorPetAlphabet {
    public int compare(Pet o1, Pet o2) {
        int out = 0;
        for (int i = 0; i < Math.min(o1.getNick().length(), o2.getNick().length()); i++) {
            if (o1.getNick().charAt(i) > o2.getNick().charAt(i)) {
                out = 1;
                break;
            } else if (o1.getNick().charAt(i) < o2.getNick().charAt(i)) {
                out = -1;
                break;
            }
        }
        return out;
    }
}
