package patterns;

import java.util.Scanner;

/*
n*n
1234
1234
1234
1234
 */

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n) {
            int j = 1;
            while(j <= n) {
                System.out.print(j);
//                System.out.print(n-j+1); // For reverse
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
