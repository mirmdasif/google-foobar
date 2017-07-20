package level3;

/**
 * @author asif.hossain
 * @since 7/19/17.
 */
public class Checksum {
    public static int answer(int start, int length) {
        int cuttingPos = length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == cuttingPos){
                    start += length - cuttingPos;
                    break;
                } else {
                    sum = sum ^ start++;
                }
            }
            cuttingPos--;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(5 ^ 6 ^ 7 ^ 8 ^ 9 ^ 10 ^ 11 ^ 13 ^ 14 ^ 17);
        System.out.println(answer(5, 4));
    }
}
