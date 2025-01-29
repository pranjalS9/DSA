package src.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 6, 1, 9};

        sort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    private static void sort(int[] arr, int s, int e) {
        if(s >= e) return;

        int mid = s + (e - s)/2;
        sort(arr, s, mid);
        sort(arr, mid + 1, e);
        mergeSortedArrays(arr, s, mid, e);
    }

    private static void mergeSortedArrays(int[] arr, int s, int mid, int e) {
        int[] leftArr = new int[mid - s + 1];
        int[] rightArr = new int[e - mid];

        // Copy data to leftArr and rightArr
        for(int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[s + i];
        }

        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, index = s;
        while(i < leftArr.length && j < rightArr.length) {
            if(leftArr[i] <= rightArr[j]) {
                arr[index] = leftArr[i];
                i++;
            } else {
                arr[index] = rightArr[j];
                j++;
            }
            index++;
        }

        while(i < leftArr.length) {
            arr[index] = leftArr[i];
            i++;
            index++;
        }

        while(j < rightArr.length) {
            arr[index] = rightArr[j];
            j++;
            index++;
        }
    }

    private static void printArr(int[] arr) {
        for(int e : arr) {
            System.out.print(e + ", ");
        }
    }
}
