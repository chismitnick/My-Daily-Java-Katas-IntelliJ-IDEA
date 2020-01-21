package Deadlock;
//special type of error that you need to avoid that relates specifically to multitasking is deadlock,
//which occurs when two threads have a circular dependency on a pair of synchronized objects.
// csamiselo@github.com Jan 2020

public class Alpha {
    synchronized void foo(Beta b) {
        String name = Thread.currentThread().getName();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Alpha has been Interrupted");

        }
        System.out.println(name + "trying to call b.last()");
        b.last();
    }
        synchronized  void last() {
            System.out.println("Inside Alpha.last");
        }

}

