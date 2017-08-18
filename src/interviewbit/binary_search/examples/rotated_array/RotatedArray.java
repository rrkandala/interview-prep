package interviewbit.binary_search.examples.rotated_array;
import java.util.List;

/**
 * Created by izzymoriguchi on 8/18/17.
 */
public class RotatedArray {
    public int findMin(final List<Integer> a) {
        int n = a.size();
        int first = 0;
        int last = n - 1;

        while (first <= last) {
            if (a.get(first) <= a.get(last)) {
                return a.get(first);
            }
            int middle = (first + last) / 2;
            int next = (middle + 1) % n;
            int prev = (middle + n - 1) % n;
            if (a.get(prev) >= a.get(middle) && a.get(next) >= a.get(middle)) {
                return a.get(middle);
            } else if (a.get(middle) <= a.get(last)) {
                last = middle - 1;
            } else if (a.get(middle) >= a.get(first)) {
                first = middle + 1;
            }
        }
        return -1;
    }
}
