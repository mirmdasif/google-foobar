package sorting.insertsort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author asif.hossain
 * @since 7/27/17.
 */
public class InsertSortTest {
    @Test
    public void emptyArrayReturnsEmpty() {
        int[] a = new int[0];
        InsertSort.sort(a);
        Assert.assertTrue(a.length == 0);
    }

    @Test
    public void handleMultipleElement() {
        int[] a = new int[] {5, 2, 3, 6, 8};
        InsertSort.sort(a);
        Assert.assertArrayEquals(a, new int[] {2, 3, 5, 6, 8});
    }

    @Test
    public void arrayWithRepeatingElement() {
        int[] a = new int[] {5, 2, 3, 3, 6, 6, 8};
        InsertSort.sort(a);
        Assert.assertArrayEquals(a, new int[] {2, 3, 3, 5, 6, 6, 8});
    }
}
