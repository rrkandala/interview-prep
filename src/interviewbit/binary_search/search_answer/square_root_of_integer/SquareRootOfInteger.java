package interviewbit.binary_search.search_answer.square_root_of_integer;

/**
 * Created by izzymoriguchi on 8/21/17.
 */
public class SquareRootOfInteger {
    public int sqrt(int a) {
        if (a == 0) {
            return 0;
        }
        int f = 1;
        int l = a;

        while (f <= l) {
            int m =  (f + l) / 2;
            if (m == a / m) {
                return m;
            } else if (a / m < m) {
                l = m - 1;
            } else {
                f = m + 1;
            }
        }
        return l;
    }
}
