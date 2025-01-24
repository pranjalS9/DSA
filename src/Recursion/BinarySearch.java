package src.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 10, 14, 18};
        int size = arr.length;
        int key = 16;

        System.out.println(binarySearch(arr, 0, size, key));
    }

    private static boolean binarySearch(int[] arr, int s, int e, int k) {
        if(s > e) {
            return false;
        }

        int mid = s + (e-s)/2;

        if(arr[mid] == k) {
            return true;
        }

        if(arr[mid] < k) {
            return binarySearch(arr, mid + 1, e, k);
        } else {
            return binarySearch(arr, s, mid - 1, k);
        }
    }
}
