package org.siddhantangore.projectEuler;

import java.math.BigInteger;

/**
 * Table    Ways    Some multiplier
 * 1x1      = 2     2 + 2
 * 2x2      = 6     3 + 2
 * 3x3      = 20    3 + 10
 * 4x4      = 70    24
 * 5x5      = 252   120
 * .
 * .
 * 20x20 = ?
 */
public class Question_15 {
    public static void main(String[] args) {
        int n = 21;
        BigInteger[][] grid = new BigInteger[n][n];
        initialiseGridEdge(grid);
        renderInternalEdges(grid);
        printGrid(grid);
    }

    private static void renderInternalEdges(BigInteger[][] grid) {
        for (int row = 1; row < grid.length; row++) {
            for (int col = 1; col < grid.length; col++) {
                // Logic to update the number of ways to reach this point
                grid[row][col] = grid[row][col - 1].add(grid[row - 1][col]);
            }
        }
    }

    private static void initialiseGridEdge(BigInteger[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                grid[row][col] = BigInteger.ONE;
            }
        }
    }

    private static void printGrid(BigInteger[][] grid) {
        for (BigInteger[] row: grid) {
            for (BigInteger num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
