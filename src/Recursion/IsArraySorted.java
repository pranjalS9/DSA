package src.Recursion;

import java.util.Arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 6, 8, 9};
        boolean ans = isSorted(arr, arr.length);
        if(ans) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    private static boolean isSorted(int[] arr, int length) {
        if(length == 0 || length == 1) {
            return true;
        }
        if(arr[0] > arr[1]) {
            return false;
        } else {
            int[] subArray = Arrays.copyOfRange(arr, 1, arr.length);
            return isSorted(subArray, subArray.length);
        }
    }
}
