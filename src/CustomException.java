/**
 * A sample program that demonstrate how to create your own exception class
 * this can be done creating a subclass of the Exception class from java.lang
 * The Exception class does not have any method implementations
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
        return "CustomException" + variable + "]";
    }
}
//inner class to check condition and throw exception
class ExceptionHelper {
    static void execute(double a) throws Exception {
        System.out.println("This is printed from within the method labelled as 'execute'");
        if (a > 10.0)
            throw new CustomException(a);
        System.out.println("the exception is raised ");
    }

    public static void main(String[] args) {
        try {
            execute(3);
            execute(20); //raises an exception that is handled in the next block

        } catch (Exception e) {
            System.out.println("Exception has been handled from the main method");
        }


    }
}
