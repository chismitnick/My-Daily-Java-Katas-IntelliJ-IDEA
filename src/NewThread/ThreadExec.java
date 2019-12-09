package NewThread;


// This is the main program that runs the class that contains the secondary thread


public class ThreadExec{

    public static void main(String[] args) {
        new NewThread(); // create a new thread
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(" The main thread interrupted.");
        }
        System.out.println(" The main  thread is now exiting.");
    }
}




