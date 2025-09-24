package com.ncr.test.pyramid.solver.impl;

import com.ncr.test.pyramid.data.Pyramid;
import com.ncr.test.pyramid.solver.PyramidSolver;

/**
 * TASK: There is something wrong here. A few things actually...
 */
public class NaivePyramidSolver implements PyramidSolver {
    @Override
    public long pyramidMaximumTotal(Pyramid pyramid) {
        int totalRows = pyramid.getRows();
        if (totalRows == 0) return 0;

        // memo row r has length (totalRows - r)
        Long[][] memo = new Long[totalRows][];
        for (int r = 0; r < totalRows; r++) {
            memo[r] = new Long[totalRows - r]; // null = not calculated
        }

        // start from the bottom: row = totalRows-1, column = 0 (the bottom row is always length 1)
        return getTotalAbove(totalRows - 1, 0, pyramid, memo, totalRows);


        // you always start at (row = lastRow, column = 0) but the bottom row can have multiple starting positions.
        // you need to check all bottom elements and pick the best path
        //return getTotalAbove(pyramid.getRows() - 1, 0, pyramid);
    }

    private long getTotalAbove(int row, int col, Pyramid pyramid, Long[][] memo, int totalRows) {
        if (memo[row][col] != null) return memo[row][col];
        
        int myValue = pyramid.get(row, col);

        // Base case: reached the top row
        if (row == 0) {
            memo[row][col] = (long) myValue;
            return memo[row][col];
        }

        // length of parent (row-1)
        int parentLen = totalRows - (row - 1); // = totalRows - row + 1

        long left = Long.MIN_VALUE, right = Long.MIN_VALUE;

        // left parent: (row-1, col)
        if (col < parentLen) {
            left = myValue + getTotalAbove(row - 1, col, pyramid, memo, totalRows);
        }

        // right parent: (row-1, col+1)
        if (col + 1 < parentLen) {
            right = myValue + getTotalAbove(row - 1, col + 1, pyramid, memo, totalRows);
        }

        long result = Math.max(left, right);
        memo[row][col] = result;
        return result;
    }

    // base case is wrong, returning 0 at the top loses the value in row 0 (the top element)
    // should instead return the value of the top element
    // if (row == 0) return 0;

    // int myValue = pyramid.get(row, column);
    // long left  = myValue + getTotalAbove(row - 1, column, pyramid);

    // When you move upwards, you can't always go to column + 1. Sometimes that index doesn't exist
    // long right = myValue + getTotalAbove(row - 1, column + 1, pyramid);
    // return Math.max(left, right);
}
