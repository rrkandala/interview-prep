package ctci.ch01.q03;

/**
 * Created by izzymoriguchi on 8/8/17.
 */
public class Q03 {
    public String URLify(String str, int trueSize) {
        // count the number of space in string
        int count = 0;
        for (int i = 0; i < trueSize; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        // 3 represents the length of ‘%20’
        int lenOfOutput = trueSize + count * 3 - count;
        char[] output = new char[lenOfOutput];
        int k = 0;
        for (int i = 0; i < trueSize; i++) {
            if (str.charAt(i) == ' ') {
                output[k] = '%';
                output[k + 1] = '2';
                output[k + 2] = '0';
                k = k + 3;
            } else {
                output[k] = str.charAt(i);
                k++;
            }
        }
        return new String(output);
    }
}
