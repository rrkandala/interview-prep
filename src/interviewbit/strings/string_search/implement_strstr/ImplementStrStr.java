package interviewbit.strings.string_search.implement_strstr;

/**
 * Created by izzymoriguchi on 8/24/17.
 */
public class ImplementStrStr {
    public int strStr(final String A, final String B) {
        if (A.length() < B.length() || B.length() == 0) {
            return -1;
        }
        if (A.length() == 0 && B.length() == 0) {
            return -1;
        }

        int index = -1;
        for (int i = 0; i < A.length(); i++) {
            if (B.charAt(0) != A.charAt(i)) {
                continue;
            }

            if (A.length() - i < B.length()) {
                return -1;
            }

            index = i;
            for (int j = 0; j < B.length(); j++) {
                if (B.charAt(j) != A.charAt(i + j)) {
                    break;
                }
            }
        }
        return index;
    }
}
