package isAliveAndJoin;
/*
*A simple program to demonstrate the usage of the isAlive and join() methods
* The Thread class provides two ways to determine whether a thread has finished
*  * 1. isAlive()
* :The isAlive( ) method returns true if the thread upon which it is called is still running. It
returns false otherwise
*
* A more commonly used method to wait for a thread to finish is called join()
*usage : final void join( ) throws InterruptedException
* this method waits until the thread on which it is called terminates
*name comes from
the concept of the calling thread waiting until the specified thread joins it
*
* csamiselo@gmail.com 2019 December
*/

public class UseJoin implements Runnable {
    String name; //name of the thread
    Thread t;

    UseJoin(String nameOfThread) {
        name = nameOfThread;
        t = new Thread(this, name);
        System.out.println("New Thread" + t);
        t.start();
    }

    public void run() {
        try {
            for (int x = 5; x > 0; x--) {
                System.out.println(name + " :" + x);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println(name + " thread interrupted");
        }
        System.out.println("The thread is exiting");
    }

}
