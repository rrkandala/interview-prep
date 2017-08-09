package ctci.ch01.q04;

/**
 * Created by izzymoriguchi on 8/9/17.
 */
public class Q04 {
    public boolean palindromePermutation(String str) {
        int[] countChar = new int[128];
        int size = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            if (lowerStr.charAt(i) != ' ') {
                int charIndex = (int) lowerStr.charAt(i);
                countChar[charIndex]++;
                size++;
            }
        }

        if (size == 0) {
            return false;
        } else if (size == 1 || countChar.length == 1) {
            return true;
        }

        int oddCount = 0;
        for (int i = 0; i < countChar.length; i++) {
            if (oddCount > 1) {
                return false;
            }
            if (countChar[i] % 2 != 0) {
                oddCount++;
            }
        }
        return true;
    }

}
