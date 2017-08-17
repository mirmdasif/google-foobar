package sorting.quicksort;

/**
 * @author asif.hossain
 * @since 7/27/17.
 */
public class QuickSort {
    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private  static void sort(int[] a, int left, int right) {
        if(left >= right) return;

        int pivotIndex = partion(a, left, right);

        sort(a, left, pivotIndex - 1);
        sort(a, pivotIndex + 1, right);
    }

    private static int partion(int[] a, int left, int right) {
        int pivot = a[right];
        int pindex = left;

        for (int i = left; i < right - 1; i++) {
            if(a[i] < pivot) {
                int temp = a[i];
//                a[i] =
            }
        }
        return 0;
    }
}
