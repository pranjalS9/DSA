package src.BinarySearch;

public class PivotInMountainArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1};
        int pivot = getPivot(arr);
        System.out.println("Pivot index is: " + pivot);
    }

    private static int getPivot(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s)/2;
            if(arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return e;
    }
}
