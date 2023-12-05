package home_work_7;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String str) {
        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length();
            }
            else {
                break;
            }
        }

        return count;
    }


}
