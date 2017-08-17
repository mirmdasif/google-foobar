package level3.accesscodes;

import java.util.*;

public class Answer {
    static int answer(int[] codes) {
        Arrays.sort(codes);
        Map<Integer, List<Integer>> map = new HashMap<>(codes.length);

        for (int i = 0; i < codes.length; i++) {
            map.put(codes[i], new LinkedList<>());

            for (int j = i + 1; j < codes.length; j++ ) {
                if (codes[j] % codes[i] == 0) {
                    map.get(codes[i]).add(codes[j]);
                }
            }
        }

        int count = 0;

        for (int i = 0; i < codes.length; i++) {
            List<Integer> mult = map.get(codes[i]);
            for (int j : mult) {
                if (map.get(j).size() >= 1) {
                    count += map.get(j).size();
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        answer(new int[]{1, 2, 3, 4, 5, 6, 12});
    }
}
