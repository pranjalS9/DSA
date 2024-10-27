package src.bit_manipulation;

public class BitwiseOperators {
    public static void main(String args[]) {
        int a = 4; //100
        int b = 6; //110
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));

        // ~a = 111...11011 -> -ve number
        //So take 2's complement to display the answer
        System.out.println("NOT: " + (~a));

        System.out.println("XOR: " + (a ^ b));

        System.out.println("RIGHT SHIFT: " + (17 >> 1)); // 17/2
        System.out.println("RIGHT SHIFT: " + (17 >> 2)); // 17/(2*2)
        System.out.println("LEFT SHIFT: " + (19 << 1)); // 19*2
        System.out.println("LEFT SHIFT: " + (21 << 2)); // 21*2*2
    }
}
