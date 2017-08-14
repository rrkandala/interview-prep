package interviewbit.math.combinatorics.grid_unique_paths;

/**
 * Created by izzymoriguchi on 8/14/17.
 */
public class GridUniquePaths {
    public int uniquePaths(int a, int b) {
        if (a == 1 && b == 1) {
            return 1;
        }
        int[][] paths = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0) {
                    if (j == 0) {
                        paths[i][j] = 0;
                    } else {
                        paths[i][j] = 1;
                    }
                } else if (j == 0) {
                    paths[i][j] = 1;
                } else {
                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                }
            }
        }
        return paths[a - 1][b - 1];
    }
}
