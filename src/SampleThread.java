/**
 * A simple Java program to demonstrate the concept of using threads in Java by controlling the main Thread
 * Notes:
 * Threads can exist in the following states:running,suspended,resumed,bocked(resource based) and Terminated
 * thread priorities are integer values that determine the relative priority of one thread to another
 * the thread's priority can be used to decide when to switch from one running thread to the other, this is known as "Context Switching"
 * A thread with a higher priority can preempt a lower priority thread an start its execution by suspended a lower priority thread this is known as "Preemptive Multitasking"
 * thread synchronization is handled using a 'monitor'. It holds one thread at a time and can be used to protect a shsared asset form being manipulated by more than one thread at a time.
 * Java provides a clean, low-cost way for two or more
 * threads to talk to each other, via calls to predefined methods that all objects have: 'Messaging'
 * multithreading system is built upon the Thread class, its methods, and its companion
 * interface, Runnable. Thread encapsulates a thread of execution.
 * When a Java program starts up, one thread begins running immediately. This is usually
 * called the main thread ,you must obtain a reference to it by
 * calling the method currentThread( ), which is a public static member of Thread.
 */

public class SampleThread {

    public static void main(String[] args) {
        //Declaration nof new thread object to obtain reference to main thread using currentThread() method
        Thread t = Thread.currentThread();

        //Print the name of the current thread
        System.out.println("The current thread is :" + t);

        //set the name of the thread
        t.setName("Main Thread");
        System.out.println("The name of the thread has changed to:" + t);

        try {
            //Performs a count down from 10 going downwards and takes an interval of 1second between each count
            for (int i = 10; i > 0; i--) {
                System.out.println(i);

                //specifies the delay period in milliseconds
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

            //displays, in order: the name of the thread, its priority and the name of its group
            System.out.println("The main thread execution has been interrupted by:" + e);

        }
    }

}

