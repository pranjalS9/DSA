package src.BinarySearch;

import java.util.Scanner;

public class Algorithm {
    private static boolean binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == key) {
                return true;
            }
            if(key > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, -2, 10, 22, -1, 0, 5, 22, 1};

        System.out.println("Enter element to search: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        boolean found = Algorithm.binarySearch(arr, key);
        if(found) {
            System.out.println("Key is present");
        }else {
            System.out.println("Key is not present!!");
        }
    }
}
