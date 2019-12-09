package NewThread;
/*
 *
 * A sample program to demonstrate the various methods in which a thread maybe created
 * this can be done in one of two ways :
 * 1.implementing the Runnable interface : To implement Runnable, a class need only implement a
 * single method called run( )
 * After you create a class that implements Runnable, you will instantiate an object of type
 * thread from within that class
 *
 * csamiselo@github.com
 * */
public class NewThread implements Runnable {
    //instantiation of an object of type thread
    Thread t;

    NewThread() {
// Create a new, second thread
        t = new Thread(this, "Child Thread");
        System.out.println("Child thread: " + t);
        t.start(); // Start the thread
    }

    // execution of child  thread begins here.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(" Value of Child Thread: " + i);

                //Interval expressed in milliseconds
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("The child thread has been interrupted.");
        }
        System.out.println("The child thread has been.");
    }

}