package src.BinarySearch;

public class SearchInRotatedSortedArray {
    private static int getPivot(int[] arr) {
        int s = 0, e = arr.length-1;

        while(s < e) {
            int mid = s + (e-s)/2;
            if(arr[mid] >= arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

    private static int binarySearch(int[] arr, int s, int e, int key) {
        int start = s;
        int end = e;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == key) {
                return mid;
            }
            if(key > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int findPosition(int[] arr, int k) {
        int pivot = getPivot(arr);
        if(k >= arr[pivot] && k <= arr[arr.length-1]) {
            return binarySearch(arr, pivot, arr.length-1, k);
        } else {
            return binarySearch(arr, 0, pivot-1, k);
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 10, 17, 1, 3};
        int pos = findPosition(arr, 1);
        if(pos >= 0) {
            System.out.println("Target found at position: " + pos);
        } else {
            System.out.println("Target NOT found!!");
        }
    }
}
