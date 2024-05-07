package com.leetcodepractice.datastructures;

public class BinarySearch {

    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 55;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

    }

    public static int binarySearchDemo(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            //this is the formula to calculate the middle of the pointers. 
            //Example: low = 4, high = 18
            // 4 + (18-4)/2 
            //4 + 14 / 2
            //4 + 7 = 11
            //middle = 11
            //
            int middle = low + (high - low) / 2;
            int value = array[middle];

            //If the target value is less than the middle, we move the low to one
            //more than that value. If it's greater, we move the high to one less than 
            //that value. Otherwise we return that value
            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
