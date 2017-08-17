package sorting.bubblesort;

import java.util.Arrays;

/**
 * @author asif.hossain
 * @since 7/27/17.
 */
public class BubbleSort {
    public static void sort(int[] a) {
        boolean sorted;
        do {
            sorted = false;
            for (int j = 0; j < a.length - 1; j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    sorted = true;
                }
            }
        } while (sorted);

        System.out.println(Arrays.toString(a));
    }
}
