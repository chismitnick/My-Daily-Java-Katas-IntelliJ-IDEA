// Demonstrate the bitwise logical operators.
class BitLogic {
    public static void main(String args[]) {
        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println("a");
        System.out.println("b");
        System.out.println("a|b");
        System.out.println("a&b");
        System.out.println("a^b");
        System.out.println("~a&b|a&~b");
        System.out.println("~a");
    }
}