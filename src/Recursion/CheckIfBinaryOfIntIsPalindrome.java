package src.Recursion;

public class CheckIfBinaryOfIntIsPalindrome {
    public static void main(String[] args) {
        int n = 4;
        String binary = getBinary(n);
        if(isPalindrome(binary)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }

    private static boolean isPalindrome(String binary) {
        return reverseString(binary, 0, binary.length() - 1).equals(binary);
    }

    private static String reverseString(String str, int s, int e) {
        if( s > e) {
            return str;
        }
        String reversedString = swapString(str, s, e);
        s++;
        e--;
        return reverseString(reversedString, s, e);
    }

    private static String swapString(String str, int s, int e) {
        char[] arr = str.toCharArray();
        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        return new String(arr);
    }

    private static String getBinary(int n) {
        int ans = 0, i = 0;
        while(n != 0) {
            int bit = n & 1;
            ans = (int) ((bit * Math.pow(10, i)) + ans);
            n = n >> 1;
            i++;
        }
        return String.valueOf(ans);
    }
}
