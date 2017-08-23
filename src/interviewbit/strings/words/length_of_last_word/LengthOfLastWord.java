package interviewbit.strings.words.length_of_last_word;

/**
 * Created by izzymoriguchi on 8/22/17.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(final String a) {
        int n = a.length();
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a.charAt(i) != ' ') {
                count++;
            }
            if (count > 0 && a.charAt(i) == ' ') {
                return count;
            }
        }
        return count;
    }
}
