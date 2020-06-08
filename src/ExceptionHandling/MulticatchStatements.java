package ExceptionHandling;

/**
 * multi-catch feature allows two or more exceptions to be caught by the same catch
 * clause
 * in order to do this an or statement is used to separate the two exceptions
 * */

public class MulticatchStatements {
    public static void main(String[] args) {
        int a=10,b=0;
        int values[] = {1,2,3};
        try{
            int result = a/b;
            values[10]=19;
        } catch (ArithmeticException|ArrayIndexOutOfBoundsException e) {
            System.out.println("ExceptionHandling.Exception has been caught " +e);
        }

        }
    }


