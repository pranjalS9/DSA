package patterns;

import java.util.Scanner;

/*
n*n
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
*/

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int i = 1, count = 1;
        while(i <= n) {
            int j = 1;
            while(j <= n) {
                System.out.print(count + " ");
                count = count + 1;
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
