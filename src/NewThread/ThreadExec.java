package NewThread;


// This is the main program that runs the class that contains the secondary thread


public class ThreadExec{

    public static void main(String[] args) {
        new NewThread(); //create a new thread

        try {
            //display numbers in a count down fashion
            for(int k =8;k>0;k--) {
                System.out.println("This is the main thread:" +k);

                //delay of 1000 milliseconds
                Thread.sleep(1000);
            }
            } catch (InterruptedException e) {
            System.out.println("Main thread has been interrupted");
        }
        System.out.println("The main thread is now exiting");
    }



}