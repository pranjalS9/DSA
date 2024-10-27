package src.binary_search;

import java.util.Scanner;

public class FirstAndLastPositionInSortedArray {
    private static int firstOcc(int arr[], int key) {
        int s = 0, e = arr.length-1;
        int ans = -1;
        while(s <= e) {
            int mid = s + (e - s)/2;
            if(arr[mid] == key) {
                ans = mid;
                e = mid - 1;
            }
            else if(key > arr[mid]) {
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }

    private static int lastOcc(int arr[], int key) {
        int s = 0, e = arr.length-1;
        int ans = -1;
        while(s <= e) {
            int mid = s + (e - s)/2;
            if(arr[mid] == key) {
                ans = mid;
                s = mid + 1;
            }
            else if(key > arr[mid]) {
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 5};

        System.out.println("Enter element to search: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int firstOcc = FirstAndLastPositionInSortedArray.firstOcc(arr, key);
        int lastOcc = FirstAndLastPositionInSortedArray.lastOcc(arr, key);

        if(firstOcc != -1) {
            System.out.println("First Occurrence: " + firstOcc);
        }else {
            System.out.println("Not present!!");
        }

        if(lastOcc != -1) {
            System.out.println("Last Occurrence: " + lastOcc);
        }else {
            System.out.println("Not present!!");
        }

    }
}
