package org.siddhantangore.crackingthecodinginterview.bigo;

/**
 * What is the runtime of the below code?
 */
public class Ex1 {
    public static void main(String[] args) {
        f (1);
    }
    public static int f (int n) {
        if (n <= 1) {
            return 1;
        }
        return f (n - 1) + f (n - 1);
    }
}
/*
  The runtime is O(N)
  For any input N > 1
  it will have N levels

  Ex.
  Level    Nodes
  0        1
  1        2
  2        4
  3        8
  4        16
  5        32

  So this means that, for Level n the nodes would be 2^n

  Therefore, Runtime would be O(2^N)

  and the space complexity would be O(N)?

  The space complexity for the recursive call is given by the maximum depth of the tree

  So, here in the example the max Depth of N = 5
  is 5 hence the space complexity is O(N)
 */