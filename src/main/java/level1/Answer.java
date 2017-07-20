package level1;

import java.util.*;

/**
 * @author asif.hossain
 * @since 7/19/17.
 */
public class Answer {
    public static int[] answer(int[] data, int n) {

        // Your code goes here.
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if (freq.get(data[i]) == null) {
                freq.put(data[i], 1);
            } else {
                freq.put(data[i], freq.get(data[i]) + 1);
            }
        }

        List<Integer> integerList = new LinkedList<>();

        for (int i = 0; i < data.length; i++) {
            if (freq.get(data[i]) <= n) {
                integerList.add(data[i]);
            }
        }

        int[] result = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            result[i] = integerList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(answer(new int[] {1, 2, 3}, 0)));
    }
}