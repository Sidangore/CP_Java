package org.siddhantangore.dataStructuresAndAlgorithms.arrays;

public class FrequenciesInSortedArray {
    public static void main (String[] args) {
        int[] arr = {40, 50, 50, 50}; // {10, 10, 10, 30, 30, 40};
        getFrequencies(arr);
    }
    public static void getFrequencies (int[] arr) {
        int currentValue = arr[0], frequencyOfCurrentValue = 1;
        if (arr.length == 1) {
            System.out.println(currentValue + " : " + frequencyOfCurrentValue);
            return;
        }
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] == currentValue) {
                frequencyOfCurrentValue++;
            } else {
                System.out.println(currentValue + " : " + frequencyOfCurrentValue);
                currentValue = arr[index];
                frequencyOfCurrentValue = 1;
            }
        }
        System.out.println(currentValue + " : " + frequencyOfCurrentValue);
    }
}
