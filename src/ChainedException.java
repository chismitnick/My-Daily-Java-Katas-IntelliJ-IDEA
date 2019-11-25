/**
 * A sample program to demonstrate the usage of chained exceptions
 * Chained Exceptions ar a concept that was introduced in Jdk 1.4
 * they enable the association between exceptions
 * by defining one exception as the root cause of another
 *
 */

public class ChainedException {
    static void chainmeth(){
        //create an exception
        NullPointerException e = new NullPointerException("top layer");

        //add a cause exception f
        e.initCause(new ArithmeticException("this is the cause"));

        throw e;
    }

    public static void main(String[] args) {
        try {
                chainmeth();
        }catch(NullPointerException e) {
            //Show the top level exception
            System.out.println("Caught:" +e);

            //display the cause of the exception
            System.out.println("Original cause:" + e.getCause());
        }
        }
    }

