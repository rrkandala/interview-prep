package ctci.ch01.q02;

/**
 * Created by izzymoriguchi on 8/8/17.
 */
public class Q02 {
    public boolean checkPermutation(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] setOfChars1 = new int[128];
        int[] setOfChars2 = new int[128];

        for (int i = 0; i < word1.length(); i++) {
            int index1 = (int) word1.charAt(i);
            int index2 = (int) word2.charAt(i);
            setOfChars1[index1] += 1;
            setOfChars2[index2] += 1;
        }

        for (int i = 0; i < 128; i++) {
            if (setOfChars1[i] != setOfChars2[i]) {
                return false;
            }
        }
        return true;
    }
}
