package interviewbit.strings.string_simulation.longest_common_prefix;

/**
 * Created by izzymoriguchi on 8/23/17.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] A) {
        StringBuilder builder = new StringBuilder();
        int n = A.length;
        if (n == 0) {
            return "";
        }

        int shortest = A[0].length();
        for (int i = 1; i < n; i++) {
            if (A[i].length() < shortest) {
                shortest = A[i].length();
            }
        }

        char letter = '\0';
        for (int i = 0; i < shortest; i++) {
            letter = A[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (letter != A[j].charAt(i)) {
                    return builder.substring(0);
                }
            }
            builder.append(letter);
        }
        return builder.substring(0);
    }
}
