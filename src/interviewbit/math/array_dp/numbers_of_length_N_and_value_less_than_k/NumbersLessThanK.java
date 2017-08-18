package interviewbit.math.array_dp.numbers_of_length_N_and_value_less_than_k;
import java.util.ArrayList;

/**
 * Created by izzymoriguchi on 8/17/17.
 * Still in progress.
 */
public class NumbersLessThanK {
    public int solve(ArrayList<Integer> A, int B, int C) {
        if (B > String.valueOf(C).length()) {
            return 0;
        }

        int permutation = (int) (Math.pow(A.size(), B));
        if (B < String.valueOf(C).length()) {
            if (A.get(0) == 0) {
                permutation -= permutation / A.size();
            }
            return permutation;
        }

        int count = 0;
        String str = Integer.toString(C);
        if (B == 1) {
            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) < C) {
                    count++;
                }
            }
            return count;
        }

        for (int i = 0; i < str.length(); i++) {
            int digit = Integer.parseInt(Character.toString(str.charAt(i)));

            if (digit < A.get(0)) {
                break;
            }
            if (digit > A.get(A.size() - 1)) {
                count = count + permutation;
                break;
            }
            for (int j = 0; j < A.size(); j++) {
                if (digit <= A.get(j)) {
                    count = count + permutation * j / A.size();
                    permutation = permutation / A.size();
                    break;
                }
            }
        }
        if (A.get(0) == 0) {
            count = count - (int) (Math.pow(A.size(), B)) / A.size();
        }
        return count;

    }
}
