package interviewbit.strings.string_simulation.palindrome_string;

/**
 * Created by izzymoriguchi on 8/20/17.
 */
public class PalindromeString {
    public int isPalindrome(String a) {
        int first = 0;
        int last = a.length() - 1;
        while (first <= last) {
            char firstChar = Character.toLowerCase(a.charAt(first));
            char lastChar = Character.toLowerCase(a.charAt(last));
            if (!Character.isDigit(firstChar)
                    && !Character.isLetter(lastChar)) {
                first++;
                continue;
            }

            if (!Character.isDigit(firstChar)
                    && !Character.isLetter(lastChar)) {
                last--;
                continue;
            }


            if (firstChar != lastChar) {
                return 0;
            }
            first++;
            last--;
        }
        return 1;
    }
}
