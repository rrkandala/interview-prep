package ctci.ch01.q05;

/**
 * Created by izzymoriguchi on 8/10/17.
 */
public class Q05 {
    public boolean oneAway(String str1, String str2) {
        int difference = Math.abs(str1.length() - str2.length());
        if (difference > 1) {
            return false;
        }

        boolean isEdited = false;
        int smallIndex = 0;
        int bigIndex = 0;
        String biggerStr = str1;
        String smallerStr = str2;
        boolean isLengthSame = difference == 0;

        if (str1.length() < str2.length()) {
            biggerStr = str2;
            smallerStr = str1;
        }

        while (smallIndex < smallerStr.length()) {
            if (biggerStr.charAt(bigIndex) != smallerStr.charAt(smallIndex)) {
                if (isEdited) {
                    return false;
                }
                isEdited = true;
                if (!isLengthSame) {
                    smallIndex--;
                }
            }
            smallIndex++;
            bigIndex++;
        }
        return true;
    }
}
