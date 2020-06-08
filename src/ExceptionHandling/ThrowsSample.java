package ExceptionHandling;

/*This program demonstrates
* how to use the throws key word.
* in situations where a method  causes an exception it can not handle it must
* specify this behaviour so that callers of the methods can guard themselves against it.
* this is done by including a throws clause in the methods declarations
*
* The throws clause lists the type of exceptions that a method can throw
* this applies to all exceptions excluding Error RuntimeException or any of their subclasses.
* If not a compile  time error is generated
*  **/
public class ThrowsSample {
    static void test() throws IllegalAccessException{
        System.out.println("Within the first method ");
        //exception thrown explicitly using the throws statement
        throw new  IllegalAccessException("This is an exception");
    }
    public static void main(String[] args) {

        try {
            test();
        } catch(IllegalAccessException e) {
            System.out.println("This exception was caught" +e);
        }
    }


}


