package src.Arrays;

import java.util.Scanner;

public class LinearSearch {
    private static boolean search(int[] arr, int key) {
        for (int i : arr) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, -2, 10, 22, -1, 0, 5, 22, 1};

        System.out.println("Enter element to search: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        boolean found = LinearSearch.search(arr, key);
        if(found) {
            System.out.println("Key is present");
        }else {
            System.out.println("Key is not present!!");
        }
    }
}
