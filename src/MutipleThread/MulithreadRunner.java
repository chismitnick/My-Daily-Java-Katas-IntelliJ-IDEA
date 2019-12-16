package MutipleThread;
// This class runs the implementation made in the Multithread() class
// csamiselo@github.com 2019 December
public class MulithreadRunner {
    public static void main(String[] args) {
        //Declare three new threads and start there execution
        new MultiThread("First thread");
        new MultiThread("Second Thread");
        new MultiThread("Third Thread");

        try {
            // the call to
            //sleep(10000) in main( ) causes the main thread to sleep for ten seconds and ensures
            //that it will finish last.
           Thread.sleep(1000);
            }catch(InterruptedException e){
            System.out.println("Main thread has been interrupted");
        }
        System.out.println("Main thread is exiting");
    }

}
