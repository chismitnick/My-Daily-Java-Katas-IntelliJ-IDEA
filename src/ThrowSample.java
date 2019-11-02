/**
 * This program demonstrates usage of the Throw concept in exception handling
 * using the throw statement enables one to explicitly throw an exception.
 * ThrowableInstance must be an object of type Throwable. classes like String can not
 * be used as throwable. Primitive classes can.
 */


public class ThrowSample {
    //Exceptions can be thrown using one of two methods
    //1. using the throw key word and the new operator
    //2.using a parameter in a catch clause
    static void first() {
        try {
            throw new NullPointerException("This is a test");

        } catch (NullPointerException e) {
            System.out.println("Exception thrown in first() method");
            throw e; //the exception is rethrown
        }
    }
// the main method catches the re thrown exception
    public static void main(String[] args) {
        try{
            first();
        }catch(NullPointerException e) {
            System.out.println("This exception has been caught again by main()" + e);
        }

    }
}
