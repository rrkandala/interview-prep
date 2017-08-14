package ctci.ch01.q07;

/**
 * Created by izzymoriguchi on 8/13/17.
 */
public class Q07 {
    // This is my second attempt with different approach
    public int[][] rotateMatrix(int[][] original) {
        int n = original.length;
        int layer = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = layer; j < n - layer - 1; j++) {

                int top = original[i][j];

                // left to top
                original[i][j] = original[n - 1 - j][i];

                // bottom to left
                original[n - 1 - j][i] = original[n - 1 - i][n - 1 - j];

                // right to bottom
                original[n - 1 - i][n - 1 - j] = original[j][n - 1 - i];

                // top to right
                original[j][n - 1 - i] = top;
            }
            layer++;
        }
        return original;
    }
}

/* --- This is my first attempt ---
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
*/

