package interviewbit.arrays.arrangement.find_permutation;

import java.util.ArrayList;

/**
 * Created by izzymoriguchi on 8/9/17.
 */
public class FindPermutation {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        int min = 1;
        int max = B;
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < A.length(); i++) {
            char iOrD = A.charAt(i);
            if (iOrD == 'I') {
                result.add(min);
                min++;
            } else {
                result.add(max);
                max--;
            }
        }
        result.add(min);
        return result;
    }
}

