package interviewbit.arrays.array_math;

import java.util.ArrayList;
/**
 * Created by izzymoriguchi on 8/9/17.
 */
public class MinStepsInInfiniteGrid {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int step = 0;
        int currX = X.get(0);
        int currY = Y.get(0);
        for (int i = 0; i < X.size(); i++) {
            if (X.size() <= 1 || Y.size() <= 1) {
                return 0;
            }

            int disX = Math.abs(X.get(i) - currX);
            int disY = Math.abs(Y.get(i) - currY);
            step += Math.max(disX, disY);
            currX = X.get(i);
            currY = Y.get(i);
        }
        return step;
    }
}
