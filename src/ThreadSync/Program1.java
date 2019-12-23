
/*
* When two or more threads need access to a shared resource, they need some way to ensure
that the resource will be used by only one thread at a time.
*
* The process by which this is achieved is called synchronization
* synchronization is the concept of the monitor. A monitor is an object that is used
as a mutually exclusive lock
*  */

package ThreadSync;

public class Program1 {
    // The synchronized key word is used to ensure that child threads do not create a race condition
    synchronized  void call(String message) {
        System.out.println("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("]");
    }
}


