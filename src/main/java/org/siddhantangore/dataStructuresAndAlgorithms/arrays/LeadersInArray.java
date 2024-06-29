package org.siddhantangore.dataStructuresAndAlgorithms.arrays;

public class LeadersInArray {
    public static void getLeaders (int[] arr, int n) {
        int currentLeader = arr[n - 1];
        System.out.println("Leader = " + currentLeader);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > currentLeader) {
                currentLeader = arr[i];
                System.out.println("Leader = " + currentLeader);
            }
        }
    }
    public static void main (String[] args) {
        int n = 7;
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        getLeaders(arr, n);
    }
}
