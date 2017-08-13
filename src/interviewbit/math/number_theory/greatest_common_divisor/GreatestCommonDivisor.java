package interviewbit.math.number_theory.greatest_common_divisor;

/**
 * Created by izzymoriguchi on 8/12/17.
 */
public class GreatestCommonDivisor {
    public int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }
        int small = Math.min(a, b);
        int big = Math.max(a,b);

        return recursiveGCD(big, small);
    }

    public int recursiveGCD(int a, int b) {
        if (a % b == 1) {
            return 1;
        } else if (a % b == 0) {
            return b;
        } else {
            return recursiveGCD(b, a % b);
        }
    }
}
