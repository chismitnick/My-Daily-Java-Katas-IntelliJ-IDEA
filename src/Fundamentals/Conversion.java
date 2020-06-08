package Fundamentals;
/*
A java program to demonstrate conversion of data types from one form to another
by use of type casting.
*/
//Written By csamiselo@github.com 2019

class Conversion {
    public static void main(String args[]) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nFundamentals.Conversion of int to byte data type.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nFundamentals.Conversion of double to int data type.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\nFundamentals.Conversion of double to byte data type.");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}