

// A simple program to illustrate the concept of Exception Handling using
// a try catch block
class Exception {

    public static void main(String[] args) {
        int a, b;

        //enclose the code that
        //you want to monitor inside a try block
        try{

            a = 0;
            b = 42 / a;
        }

        //include a catch clause that specifies the exception type that you wish to catch
        catch (ArithmeticException e) { // catch the division byt zero error

            System.out.println("Error division by zero");
        }

            System.out.println("This statement is printed from outside the catch block ");
    }
}