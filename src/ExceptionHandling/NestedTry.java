package ExceptionHandling;

/**git
 * Written By csamiselo@github.com 2019
 */

public class NestedTry {
    public static void main(String[] args) {

        try {
            int a = args.length;
            // If no command line arguments are present
            // the program will generate a divide by zero exception

            int b = 42 / a;
            System.out.println("a =" + a);

            //Nested try block
            // if  one command line arg is used(a==1)
            //the a divide by zero exception will be generated
            try {

                if (a == 1) a = a / (a - a);
                //if two command line arguments are used (a==2)
                // an array out of bound exception is generated
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 100;
                }

            } catch (ArithmeticException e) {
                System.out.println("Fundamentals.Array Index is out of bounds:" + e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fundamentals.Array out of bounds exception:" + e);

        }
    }
}
