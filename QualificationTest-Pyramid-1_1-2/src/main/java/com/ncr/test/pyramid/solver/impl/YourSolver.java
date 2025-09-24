package com.ncr.test.pyramid.solver.impl;

import com.ncr.test.pyramid.data.Pyramid;
import com.ncr.test.pyramid.solver.PyramidSolver;


/**
 * TASK: This is your 3rd task.
 * Please implement the class to satisfy the interface. *
 */
public class YourSolver implements PyramidSolver {

    // Iterative solution
    @Override
    public long pyramidMaximumTotal(Pyramid pyramid) {
        int rows = pyramid.getRows();

        if (rows == 0) {
            return 0;
        }

        // best[r][c] = maximum sum from (r, c) up to the top
        long[][] best = new long[rows][];
        for (int r = 0; r < rows; r++) {
            best[r] = new long[rows - r]; // row lengths: N, N-1
        }

        // base: top row (row 0) is just its values
        for (int c = 0; c < best[0].length; c++) {
            best[0][c] = pyramid.get(0, c);
        }

        // fill downwards: for each cell use its two parents (row-1, c) and (row-1, c+1)
        for (int r = 1; r < rows; r++) {
            for (int c = 0; c < best[r].length; c++) {
                long leftParent = best[r - 1][c];
                long rightParent = best[r - 1][c + 1];
                best[r][c] = pyramid.get(r, c) + Math.max(leftParent, rightParent);
            }
        }

        // bottom cell has the maximum path -from-bottom-to-top
        return best[rows - 1][0];
    }
}