package sorting.bubblesort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author asif.hossain
 * @since 7/27/17.
 */
public class BubbleSortTest {
    @Test
    public void emptyArrayReturnsEmpty() {
        int[] a = new int[0];
        BubbleSort.sort(a);
        Assert.assertTrue(a.length == 0);
    }

    @Test
    public void handleMultipleElement() {
        int[] a = new int[] {5, 2, 3, 6, 8};
        BubbleSort.sort(a);
        Assert.assertArrayEquals(a, new int[] {2, 3, 5, 6, 8});
    }

    @Test
    public void arrayWithRepeatingElement() {
        int[] a = new int[] {5, 2, 3, 3, 6, 6, 8};
        BubbleSort.sort(a);
        Assert.assertArrayEquals(a, new int[] {2, 3, 3, 5, 6, 6, 8});
    }
}
