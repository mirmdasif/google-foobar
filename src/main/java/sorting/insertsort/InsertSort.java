package sorting.insertsort;

/**
 * @author asif.hossain
 * @since 7/27/17.
 */
public class InsertSort {
    public static void sort(int[] a) {
        for (int i = 0;  i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if(a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j -  1] = temp;
                }
            }
        }
    }
}
