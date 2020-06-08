package ExceptionHandling;

/**
 * A sample program that demonstrate how to create your own exception class
 * this can be done creating a subclass of the ExceptionHandling.Exception class from java.lang
 * The ExceptionHandling.Exception class does not have any method implementations
 * it does however access to the methods that are defined iin the Throwable class
 */

public class CustomException extends Exception {
    private double variable;

    //Constructor
    CustomException(double a) {
        variable = a;
    }

    //Use of the toString() method
    public String toString() {
        return "ExceptionHandling.CustomException" + variable + "]";
    }
}
//inner class to check condition and throw exception
class ExceptionHelper {
    static void execute(double a) throws Exception {
        System.out.println("Calling method execute(" + a + ")");;
        if (a > 10.0)
            throw new CustomException(a);
        System.out.println("Normal program execution completed ");
    }

    public static void main(String[] args) {
        try {
            execute(7);
            execute(20); //raises an exception that is handled in the next block

        } catch (Exception e) {
            System.out.println("ExceptionHandling.Exception raised has been handled from the main method" + ' ' +e);
        }


    }
}
