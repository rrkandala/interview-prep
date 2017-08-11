package interviewbit.math.adhoc.fizz_buzz;

import java.util.ArrayList;

/**
 * Created by izzymoriguchi on 8/10/17.
 */
public class FizzBuzz {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 1; i <= A; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add("" + i);
            }
        }
        return result;
    }
}
