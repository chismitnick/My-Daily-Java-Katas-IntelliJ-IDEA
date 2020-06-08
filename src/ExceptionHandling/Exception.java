package ExceptionHandling;// A simple program to illustrate the concept of ExceptionHandling.Exception Handling using
// a try catch block

//Written By csamiselo@github.com 2019
class Exception extends Throwable {

    public static void main(String[] args) {
        int a, b;
        //enclose the code that
        //you want to monitor inside a try block
        try {
            a = 0;
            b = 42 / a;
            // This print statement will not be printed Once
            //an exception is thrown, program control transfers out of the try block into the
            //catch block
            System.out.println("This Statement will not be printed");
        }
        //include a catch clause that specifies the exception type that you wish to catch
        catch (ArithmeticException e) { // catch the division byt zero error
            System.out.println("Error division by zero");
        }
        System.out.println("This statement is printed from outside the catch block ");
    }
}