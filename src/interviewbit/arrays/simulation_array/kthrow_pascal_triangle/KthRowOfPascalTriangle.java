package interviewbit.arrays.simulation_array.kthrow_pascal_triangle;

import java.util.ArrayList;

/**
 * Created by izzymoriguchi on 8/9/17.
 */
public class KthRowOfPascalTriangle {
    public ArrayList<Integer> getRow(int a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        if (a == 0) {
            return result.get(0);
        }
        result.add(new ArrayList<Integer>());
        result.get(1).add(1);
        result.get(1).add(1);
        if (a == 1) {
            return result.get(1);
        }

        for (int i = 2; i <= a; i++) {
            result.add(new ArrayList<Integer>());
            result.get(i).add(1);
            for (int k = 1; k < i; k++) {
                result.get(i).add(result.get(i - 1).get(k - 1) + result.get(i - 1).get(k));
            }
            result.get(i).add(1);
        }
        return result.get(a);
    }
}

