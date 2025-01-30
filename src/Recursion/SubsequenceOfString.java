package src.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceOfString {
    public static void main(String[] args) {
        String input = "abc";
        List<String> output = new ArrayList<>();
        StringBuilder subsequence = new StringBuilder();
        subsequences(input, output, subsequence, 0);
        printSubsequences(output);
    }

    private static void subsequences(String input, List<String> output, StringBuilder subsequence, int currIdx) {
        if(currIdx >= input.length()) {
            output.add(subsequence.toString());
            return;
        }

        // Exclude
        subsequences(input, output, subsequence, currIdx + 1);

        // Include
        subsequence.append(input.charAt(currIdx));
        subsequences(input, output, subsequence, currIdx + 1);

        // Backtrack
        subsequence.deleteCharAt(subsequence.length() - 1);
    }

    private static void printSubsequences(List<String> output) {
        for(String subsequence: output) {
            System.out.print(subsequence + ", ");
        }
    }
}
