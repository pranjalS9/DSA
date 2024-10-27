package patterns;

import java.util.Scanner;

/*
n*n
1111
2222
3333
4444
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n) {
            int j = 1;
            while(j <= n) {
                System.out.print(i);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
