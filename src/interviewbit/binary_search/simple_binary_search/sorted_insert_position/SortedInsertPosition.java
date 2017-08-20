package interviewbit.binary_search.simple_binary_search.sorted_insert_position;

import java.util.ArrayList;

/**
 * Created by izzymoriguchi on 8/18/17.
 */
public class SortedInsertPosition {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int n = a.size();
        int first = 0;
        int last = n - 1;

        if (b < a.get(0)) {
            return 0;
        }

        if (b > a.get(n - 1)) {
            return n;
        }

        while (first <= last) {
            int middle = (first + last) / 2;
            if (a.get(middle) == b) {
                return middle;
            } else if (a.get(middle) > b) {
                if (first == last) {
                    return middle;
                }
                if (a.get(middle - 1) < b) {
                    return middle;
                }
                last = middle - 1;
            } else {
                if (first == last) {
                    return middle + 1;
                }
                first = middle + 1;
            }
        }
        return -1;
    }
}
