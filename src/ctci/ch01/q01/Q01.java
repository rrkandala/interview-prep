package ctci.ch01.q01;

/**
 * Created by izzymoriguchi on 8/8/17.
 */
public class Q01 {
    public static boolean isUnique(String word) {
        if (word.length() <= 0 || word.length() > 128) {
            return false;
        }

        boolean[] setOfChars = new boolean[128];
        for (int i = 0; i < word.length(); i++) {
            int unicode = (int) word.charAt(i);
            if (setOfChars[unicode]) {
                return false;
            }
            setOfChars[unicode] = true;
        }
        return true;
    }
}
