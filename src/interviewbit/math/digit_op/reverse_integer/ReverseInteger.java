package interviewbit.math.digit_op.reverse_integer;

/**
 * Created by izzymoriguchi on 8/13/17.
 */
public class ReverseInteger {
    public int reverse(int a) {
        boolean isNegative = a < 0;
        int absVal = Math.abs(a);
        int result = 0;

        while (absVal > 0) {
            int lastDigit = absVal % 10;
            absVal = absVal / 10;
            long longVal = ((long) result * 10 + lastDigit);
            if (longVal > Integer.MAX_VALUE || longVal < Integer.MIN_VALUE) {
                return 0;
            }
            result = (result * 10) + lastDigit;
        }

        if (isNegative) {
            return -1 * result;
        }
        return result;
    }
}
