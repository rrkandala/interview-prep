package interviewbit.binary_search.simple_binary_search.matrix_search;
import java.util.ArrayList;

/**
 * Created by izzymoriguchi on 8/19/17.
 */
public class MatrixSearch {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        int rowLength = a.size();
        int colLength = a.get(0).size();
        if (a.get(0).get(0) > b || a.get(rowLength - 1).get(colLength - 1) < b) {
            return 0;
        }

        for (int i = 0; i < rowLength; i++) {
            if (b <= a.get(i).get(colLength - 1)) {
                int first = 0;
                int last = colLength - 1;
                while (first <= last) {
                    int middle = (first + last) / 2;
                    if (a.get(i).get(middle) == b) {
                        return 1;
                    } else if (b > a.get(i).get(middle)) {
                        first = middle + 1;
                    } else {
                        last = middle - 1;
                    }
                }

            }
        }
        return 0;
    }
}
