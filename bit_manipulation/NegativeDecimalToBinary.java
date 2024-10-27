package bit_manipulation;

import java.util.Scanner;

public class NegativeDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("The binary representation of " + decimal + " is " + binary);
    }

    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }

        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = ~n + 1; // two's complement
        }

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, (n & 1)); // use bitwise AND to get the least significant bit
            n = n >> 1; // use right shift to divide by 2
        }

        if (isNegative) {
            binary.insert(0, '-'); // add negative sign
        }

        return binary.toString();
    }
}