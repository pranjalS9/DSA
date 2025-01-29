package src.Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 3, 1};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    private static void quickSort(int[] arr, int s, int e) {
        if(s >= e) return;

        int p = partition(arr, s, e);

        quickSort(arr, s, p - 1);
        quickSort(arr, p + 1, e);
    }

    private static int partition(int[] arr, int s, int e) {
        int pivot = arr[s];
        int count = 0;

        // Count elements smaller than pivot
        for (int i = s + 1; i <= e; i++) {
            if(arr[i] <= pivot) {
                count++;
            }
        }

        // Place pivot at an index where all the elements to it's left are smaller and on right are greater
        int pivotIndex = s + count;

        int temp = pivot;
        arr[s] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        int sIdx = s, eIdx = e;
        while(sIdx < pivotIndex && eIdx > pivotIndex) {
            while(arr[sIdx] <= pivot) {
                sIdx++;
            }

            while(arr[eIdx] > pivot) {
                eIdx--;
            }

            while(sIdx < pivotIndex && eIdx > pivotIndex) {
                temp = arr[sIdx];
                arr[sIdx] = arr[eIdx];
                arr[eIdx] = temp;

                sIdx++;
                eIdx--;
            }
        }
        return pivotIndex;
    }

    private static void printArr(int[] arr) {
        for(int e : arr) {
            System.out.print(e + ", ");
        }
    }
}
