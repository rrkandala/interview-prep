package ctci.ch01.q07;

/**
 * Created by izzymoriguchi on 8/13/17.
 */
public class Q07 {
    public int[][] rotateMatrix(int[][] original) {
        int n = original.length;
        int[][] output = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                output[i][j] = original[n - 1 - j][i];
            }
        }
        return output;
    }
}
