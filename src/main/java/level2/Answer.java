package level2;

import java.util.*;

/**
 * @author asif.hossain
 * @since 7/19/17.
 */
public class Answer {
    public static String[] answer(String[] l) {
        Arrays.sort(l, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] s1Parts = s1.split("\\.");
                String[] s2Parts = s2.split("\\.");
                if(Integer.parseInt(s1Parts[0]) != Integer.parseInt(s2Parts[0]))
                    return Integer.parseInt(s1Parts[0]) - Integer.parseInt(s2Parts[0]);

                if(s1Parts.length > 1 && s2Parts.length > 1) {
                    if(Integer.parseInt(s1Parts[1]) != Integer.parseInt(s2Parts[1]))
                        return Integer.parseInt(s1Parts[1]) - Integer.parseInt(s2Parts[1]);
                } else {
                    return s1Parts.length - s2Parts.length;
                }

                if(s1Parts.length > 2 && s2Parts.length > 2) {
                    return Integer.parseInt(s1Parts[2]) - Integer.parseInt(s2Parts[2]);
                } else {
                    return s1Parts.length - s2Parts.length;
                }
            }
        });
        return l;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(answer(new String[]{ "1", "1.0", "0.1", "1.1.1", "11.2", "1.2.1", "1.11", "2", "2.0", "2.0.0", "1.2.0", "1.0.0"})));
    }
}