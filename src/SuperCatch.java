/**
 * An exception subclass must come before its superclass in
 * a series of catch statements. If not,
 * unreachable code will be created and a
 * compile-time error will result.
 */
public class SuperCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 24 / a;
            System.out.println("The value of b:" + b);
        } catch (ArithmeticException e) {
            System.out.println("Exception" + e);
        } catch (java.lang.Exception e) {
            System.out.println("This code is never reached");

        }
    }

}
