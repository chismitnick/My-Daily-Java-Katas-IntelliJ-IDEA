
//A simple program to demonstrate the use of multiple catch statements
//this happens in situation where a single block of code raises multiple exceptions
//each catch block is inspected to see if it matches the exception that is raised
public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a = 1;
            System.out.println("a =" + a);
            int b = 40 / a;
            int c[] = {1};
            c[42] = 99;
            // syntax to collapse catch blocks using Logical OR
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception:" + e);
        }
        System.out.println("This statement is only printed after the try/catch blocks");
    }
}


