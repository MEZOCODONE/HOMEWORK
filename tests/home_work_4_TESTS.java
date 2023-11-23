
package tests;

import home_work_4.ComparatorInt;
import home_work_4.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class home_work_4_TESTS {

    @Test
    public void testDeleteFromIndex() {
        DataContainer z = new DataContainer(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        z.deleteFromIndex(1);
        Assertions.assertArrayEquals(new Integer[]{1, 3, 4, 5, 6, 7, 8, 9}, z.getItems());
    }

    @Test
    public void testDeleteItem() {
        DataContainer z = new DataContainer(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        z.deleteItem(1);
        Assertions.assertArrayEquals(new Integer[]{2, 3, 4, 5, 6, 7, 8, 9}, z.getItems());
    }

    @Test
    public void testAdd() {
        DataContainer z = new DataContainer(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        z.add(1);
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}, z.getItems());
    }

    @Test
    public void testDelete() {
        DataContainer z = new DataContainer(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        z.delete(1);
        Assertions.assertArrayEquals(new Integer[]{null, 2, 3, 4, 5, 6, 7, 8, 9}, z.getItems());
    }

    @Test
    public void testGet() {
        DataContainer z = new DataContainer(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Assertions.assertEquals(3, z.get(2));
    }


    @Test
    public void testSort() {
        DataContainer z = new DataContainer(new Integer[]{9,8,7,6,5,4,3,2,1});
        z.sort(new ComparatorInt());
        Assertions.assertArrayEquals(new Integer[]{1,2,3,4,5,6,7,8,9}, z.getItems());
    }

}