package SuspendAndResume;

/* Prior to Java 2 java programs used suspend(),resume() and stop() methods to pause and resume the
execution of a thread as defined in the Thread class. These methods were deprecated mainly due to the fact
that their usage leads to deadlock situations, especially in situations were a thread is accessing a shared resource
,this ultimately causes threads that are waiting on those resources to be deadlocked.
*  */

public class NuevoThread implements Runnable {

    String name;
    Thread thread;
    boolean suspendFlag;

    // Constructor
    public NuevoThread(String threadName) {
        name = threadName; //name
        thread = new Thread(this, name);
        System.out.println("This is the thread created " + thread);

        //a flag variable that indicates
        //the execution state of the thread
        suspendFlag = false;
        thread.start(); //Starts the thread
    }

    //the run method is specified whenever a class implements the Runnable interface
    // Also serves as the execution entry point for the thread
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized ((this)) {
                    while (suspendFlag) {
                        wait();
                    }

                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + "the thread has been interrupted");
        }
        System.out.println(name + " The thread is now exiting");
    }

    //method to suspend the thread if the suspendFlag value is false(i>10)
    synchronized void suspendThread() {
        suspendFlag = true;
    }

    //method to continue running the thread if the suspend flag is false(i<10)
    synchronized void resumeThread() {
        suspendFlag = false;

        // as long as this flag is set to “running,” the run( ) method
        //must continue to let the thread execute
        notify();
    }
}

