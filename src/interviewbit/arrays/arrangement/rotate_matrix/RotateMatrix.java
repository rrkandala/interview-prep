package interviewbit.arrays.arrangement.rotate_matrix;
import java.util.ArrayList;

/**
 * Created by izzymoriguchi on 8/16/17.
 */
public class RotateMatrix {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int layer = 0;
        int n = a.size();
        for (int i = 0; i < n / 2; i++) {
            for (int j = layer; j < n - layer - 1; j++) {
                int temp = a.get(i).get(j);;

                // left to top
                a.get(i).set(j, a.get(n - 1 - j).get(i));

                // bottom to left
                a.get(n - 1 - j).set(i, a.get(n - 1 - i).get(n - 1 - j));

                // right to bottom
                a.get(n - 1 - i).set(n - 1 - j, a.get(j).get(n - 1 - i));
                // top to right
                a.get(j).set(n - 1 - i, temp);
            }
            layer++;
        }
    }
}
