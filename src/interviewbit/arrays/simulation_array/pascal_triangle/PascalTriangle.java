package interviewbit.arrays.simulation_array.pascal_triangle;

import java.util.ArrayList;

/**
 * Created by izzymoriguchi on 8/9/17.
 */
public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> generate(int a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (a <= 0) {
            return result;
        }
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        if (a == 1) {
            return result;
        }
        result.add(new ArrayList<Integer>());
        result.get(1).add(1);
        result.get(1).add(1);
        if (a == 2) {
            return result;
        }

        for (int i = 2; i < a; i++) {
            result.add(new ArrayList<Integer>());
            result.get(i).add(1);
            for (int j = 1; j < i; j++) {
                int num = result.get(i - 1).get(j) + result.get(i - 1).get(j - 1);
                result.get(i).add(num);
            }
            result.get(i).add(1);
        }

        return result;
    }
}
