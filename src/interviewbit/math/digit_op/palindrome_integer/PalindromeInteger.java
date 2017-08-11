package interviewbit.math.digit_op.palindrome_integer;

/**
 * Created by izzymoriguchi on 8/11/17.
 */
public class PalindromeInteger {
    public boolean isPalindrome(int a) {
        if (a < 0) {
            return false;
        }
        String digits = Integer.toString(a);
        int countLast = digits.length() - 1;
        for (int i = 0; i < digits.length() / 2; i++) {
            if (digits.charAt(i) != digits.charAt(countLast)) {
                return false;
            }
            countLast--;
        }
        return true;
    }
}
