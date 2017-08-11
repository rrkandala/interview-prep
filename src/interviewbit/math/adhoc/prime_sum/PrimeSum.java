package interviewbit.math.adhoc.prime_sum;

import java.util.ArrayList;

/**
 * Created by izzymoriguchi on 8/11/17.
 */
public class PrimeSum {
    public ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= a / 2; i++) {
            if (isPrime(i) && isPrime(a - i)) {
                result.add(i);
                result.add(a - i);
                break;
            }
        }
        return result;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
