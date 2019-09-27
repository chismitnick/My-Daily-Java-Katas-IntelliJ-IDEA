
import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();


        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                /* Throwable overrides the toString( ) method (defined by Object) so that it returns a string
                 containing a description of the exception. You can display this description in a println( )
                 statement by simply passing the exception as an argument **/

                /* Using throwable to display a description of the error in the stack trace**/
                System.out.println("Exception:" + e);


                // System.out.println("Division by zero Error has been generated");
                a = 0; // set the value of a to zero if an exception occurs and continue
                // program execution
            }
            System.out.println(" a:" + a);
        }
    }
}




