package interviewbit.binary_search.examples.count_element_occurence;

import java.util.List;

/**
 * Created by izzymoriguchi on 8/18/17.
 */
public class CountElementOccurrence {
    public int findCount(final List<Integer> a, int b) {
        int firstOccur = countOccr(a, b, true);
        if (firstOccur < 0) {
            return 0;
        }
        int lastOccur = countOccr(a, b, false);
        return lastOccur - firstOccur + 1;
    }

    public int countOccr(final List<Integer> a, int b, boolean isFirstOccur) {
        int first = 0;
        int last = a.size() - 1;

        // Find the first occurrence of b
        int occurrIndex = -1;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (a.get(middle) == b) {
                occurrIndex = middle;
                if (isFirstOccur) {
                    last = middle - 1;
                } else {
                    first = middle + 1;
                }
            } else if (a.get(middle) < b) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return occurrIndex;
    }
}
