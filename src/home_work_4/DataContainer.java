package home_work_4;

import javax.xml.crypto.Data;
import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {

    public static void main(String[] args) {
        String[] array = {"2", "234", "1", "12312", "2", "5", "1"};
        //Integer[] array = {1,5,4,7,323,5,4,23,5};
        DataContainer<String> digits1 = new DataContainer<>(array);
        //DataContainer<Integer> digits1 = new DataContainer<>(array);
        System.out.println(digits1.toString());
        digits1.sort(new ComparatorString());
        //digits1.sort(new ComparatorInt());
        System.out.println(digits1.toString());
    }

    T[] data;


    DataContainer(T[] data) {
        this.data = data;
    }

    public T[] getItems() {
        return data;
    }

    public boolean deleteFromIndex(int index) {
        if (index > data.length - 1) {
            return false;
        } else {
            T[] buf = (T[]) new Object[data.length - 1];
            int z = 0;
            for (int i = 0; i < data.length; i++) {
                if (i != index) {
                    buf[z] = data[i];
                    z++;
                }
            }
            data = buf;
            return true;
        }
    }

    public boolean deleteItem(T item) {
        boolean deleted = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == item) {
                deleteFromIndex(i);
                deleted = true;
            }
        }
        return deleted;
    }

    public int add(T item) {
        int index;
        if (Overflow()) {
            index = indexOfNull();
            data[index] = item;
        } else {

            T[] buf = Arrays.copyOf(data, data.length + 1);
            buf[buf.length - 1] = item;
            data = buf;
            index = data.length - 1;
        }
        return index;
    }

    public void delete(T name) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == name) {
                data[i] = null;
            }
        }
    }

    public T get(int index) {
        if (index > data.length - 1) {
            return null;
        } else {
            return data[index];
        }
    }

    private boolean Overflow() {
        boolean z = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                z = true;
            }
        }
        return z;
    }

    public void printData() {
        System.out.print('[');
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("]\n");
    }

    private int indexOfNull() {
        int z = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                z = i;
                break;
            }
        }
        return z;
    }

    void sort(Comparator<T> comparator) {
        Arrays.sort(data, comparator);
    }

    @Override
    public String toString() {
        String out = "[";
        for (int i = 0; i<data.length;i++){
            if(data[i]!=null){
                out+=data[i].toString() + ", ";
            }
        }
        return out.substring(0, out.length()-2)+"]";
    }

}
