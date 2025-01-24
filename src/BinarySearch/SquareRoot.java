package src.BinarySearch;

import java.util.Scanner;

public class SquareRoot {
    private static long binarySearch(int n) {
        long s = 0, e = n;
        long ans = -1;
        while(s <= e) {
            long mid = s + (e-s)/2;
            long square = mid*mid;
            if(square == n) {
                return mid;
            }
            if(square < n) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    private static double morePrecision(int n, int precision, long tempSol) {
        double factor = 1;
        double ans = tempSol;
        for(int i = 0; i < precision; i++) {
            factor = factor/10;
            for(double j = ans; j*j < n; j = j+factor) {
                ans = j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tempSol = binarySearch(n);
        System.out.println("Square root of " + n + " is: " + morePrecision(n, 3, tempSol));
    }
}
