package ctci.ch01.q06;

/**
 * Created by izzymoriguchi on 8/11/17.
 */
public class Q06 {
    public String stringCompression(String str) {
        if (str.length() == 0) {
            return str;
        }

        char currLetter = str.charAt(0);
        int count = 1;
        String compressedStr = "";
        for (int i = 1; i < str.length(); i++) {
            if (currLetter == str.charAt(i)) {
                count++;
            } else {
                compressedStr = compressedStr + currLetter + count;
                currLetter = str.charAt(i);
                count = 1;
            }

            if (i == str.length() - 1) {
                compressedStr = compressedStr + currLetter + count;
            }
        }

        if (str.length() == compressedStr.length()) {
            return str;
        }

        return compressedStr;
    }
}
