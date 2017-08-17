package interviewbit.math.number_encoding.rearrange_array;
import java.util.ArrayList;

/**
 * Created by izzymoriguchi on 8/17/17.
 */
public class RearrangeArray {
    public void arrange(ArrayList<Integer> a) {
        int n = a.size();

        for (int i = 0; i < n; i++) {
            int oldVal = a.get(i);
            int newVal = (a.get(a.get(i)) % n) * n;
            a.set(i, oldVal + newVal);
        }

        for (int i = 0; i < n; i++) {
            a.set(i, a.get(i) / n);
        }
    }
}
