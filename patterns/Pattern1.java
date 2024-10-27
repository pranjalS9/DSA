package patterns;

import java.util.Scanner;

/*
n*n
****
****
****
****
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n) {
            int j = 1;
            while(j <= n) {
                System.out.print("*");
                j = j+ 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
