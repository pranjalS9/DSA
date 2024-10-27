package bit_manipulation;

import java.util.Scanner;

// Question: Find the number of set (1) bits in a number
public class HammingWeight {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n != 0) {
            if((n & 1) == 1) { //Checking if last bit is 1
                count++;
            }
            n = n >> 1; //Move to previous bit
        }
        System.out.println(count);
    }
}
