package interviewbit.arrays.set_matrix_zeros;

import java.util.ArrayList;

/**
 * Created by izzymoriguchi on 8/9/17.
 */
public class SetMatrixZeros {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int rowLength = a.size();
        int colLength = a.get(0).size();
        boolean R = true;
        boolean C = true;
        // find if there is 0 in the first row and set R
        for (int i = 0; i < colLength; i++) {
            if (a.get(0).get(i) == 0) {
                R = false;
                break;
            }
        }

        // find if there is 0 in the first column and set C
        for (int i = 0; i < rowLength; i++) {
            if (a.get(i).get(0) == 0) {
                C = false;
            }
        }
        // set first row and col values based on the corresponding values
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (a.get(i).get(j) == 0) {
                    a.get(i).set(0, 0);
                    a.get(0).set(j, 0);
                }
            }
        }

        // set the inner values based on the corresponding first row and col values
        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < colLength; j++) {
                if (a.get(i).get(0) == 1 && a.get(0).get(j) == 1) {
                    a.get(i).set(j, 1);
                } else {
                    a.get(i).set(j, 0);
                }
            }
        }

        // go through the first row to change values based on R
        for (int i = 0; i < colLength; i++) {
            if (!R) {
                a.get(0).set(i, 0);
            }
        }

        // go through the first col (except for the first row) to change values based on C
        for (int i = 0; i < rowLength; i++) {
            if (!C) {
                a.get(i).set(0, 0);
            }
        }
    }
}

