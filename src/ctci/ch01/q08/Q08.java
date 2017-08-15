package ctci.ch01.q08;

/**
 * Created by izzymoriguchi on 8/14/17.
 */
public class Q08 {
    public void zeroMatrix(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        boolean zeroInFirstRow = false;
        boolean zeroInFirstCol = false;

        // check first row to see if there is 0
        for (int i = 0; i < colLength; i++) {
            if (matrix[0][i] == 0) {
                zeroInFirstRow = true;
            }
        }

        // check first col to see if there is 0
        for (int i = 0; i < rowLength; i++) {
            if (matrix[i][0] == 0) {
                zeroInFirstCol = true;
            }
        }

        // Check each value (a, b) and set (0, b) and (a, 0) to 0 if (a, b) is zero
        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < colLength; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // At each value (a, b), if (0, b) or (a, 0) is zero, set (a, b) to zero
        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < colLength; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (zeroInFirstRow) {
            for (int i = 0; i < colLength; i++) {
                matrix[0][i] = 0;
            }
        }

        if (zeroInFirstCol) {
            for (int i = 0; i < rowLength; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
