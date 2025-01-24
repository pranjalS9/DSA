package src.Recursion;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String original = "abcde";
        System.out.println(reverseString(original, 0, original.length()));
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

        return Arrays.toString(arr);
    }

}
