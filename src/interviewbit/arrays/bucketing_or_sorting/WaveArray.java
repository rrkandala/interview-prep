package interviewbit.arrays.bucketing_or_sorting;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by izzymoriguchi on 8/15/17.
 */
public class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> a) {
        Collections.sort(a);
        ArrayList<Integer> result = new ArrayList<>();
        if (a.size() == 1) {
            result.add(a.get(0));
            return result;
        }

        int num = a.size();
        boolean isOdd = false;
        if (a.size() % 2 != 0) {
            num = a.size() - 1;
            isOdd = true;
        }
        for (int i = 0; i < num; i = i + 2) {
            result.add(a.get(i + 1));
            result.add(a.get(i));
        }
        if (isOdd) {
            result.add(a.get(a.size() - 1));
        }

        return result;
    }
}
