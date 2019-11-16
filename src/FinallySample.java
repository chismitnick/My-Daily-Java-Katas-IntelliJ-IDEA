/**
 * A sample program to demonstrate the usage of the finally keyword
 * finally creates a block of code that will be executed after a try /catch block has completed
 * and before the code following the try/catch block.
 * the finally block will execute whether or no aan exception has been raised
 *
 * Written by csamiselo@github 11.2019
 * */


public class FinallySample {
    //This method throws an exception
    static void methodOne(){
        try{
            System.out.println("This is a message from inside methodOne");
            throw new RuntimeException("exception1");
        } finally {
            System.out.println("finally from methodOne");
        }
    }


    //A return fro inside a try block
    static void methodTwo(){
        try {
            System.out.println("This is a message from inside methodTwo");
            return;
        } finally {
            System.out.println("finally from methodOne");
        }
    }

    //Try block executed normally
    static void methodThree(){
        try{
            System.out.println("This is a message from methodThree");
        } finally {
            System.out.println("finally from inside method Three");
        }
    }



    public static void main(String[] args) {
        try {
            methodOne();
        }catch (RuntimeException e) {
            System.out.println("The exception is caught in the main method:" +e);
        }
        methodTwo();
        methodThree();
    }
}