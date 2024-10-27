package bit_manipulation;

import java.util.Scanner;

public class PositiveDecimalToBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int i = 0;

        while(n != 0) {
            //For small numbers, but when the binary number exceeds the range of integer
            // i.e. 2^31 to 2^(31-1) , then it gives a fix number.
            int bit = n & 1; //xxx & 1, 0xx & 1, 00x & 1
            ans = (int) ((bit * Math.pow(10, i)) + ans);
            n = n >> 1; // 0xx, 00x, 000 -> out of the loop
            i++;

            //For every number (large or small) store in STRING or ARRAY

        }
        System.out.println(ans);
    }
}
