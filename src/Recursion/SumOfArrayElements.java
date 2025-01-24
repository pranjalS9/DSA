package src.Recursion;

import java.util.Arrays;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arraySum(arr));
    }

    private static int arraySum(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }

        if(arr.length == 1) {
            return arr[0];
        }

        int[] subArray = Arrays.copyOfRange(arr, 1, arr.length);
        int remainingSum = arraySum(subArray);
        return arr[0] + remainingSum;
    }
}
