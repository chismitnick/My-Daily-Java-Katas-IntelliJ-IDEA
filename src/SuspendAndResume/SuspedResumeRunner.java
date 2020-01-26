package SuspendAndResume;

//This the class that executes the NuevoThread class by creating an object
//and implementing the methods specified in that class
public class SuspedResumeRunner {

    public static void main(String[] args) {
        NuevoThread new1 = new NuevoThread("Number One");
        NuevoThread new2 = new NuevoThread("number Two");
        try {
            Thread.sleep(1000);
            new1.suspendThread();
            System.out.println("Number One suspended");

            Thread.sleep(1000);
            new1.resumeThread();
            System.out.println("Number One resumed");

            new2.suspendThread();
            System.out.println("Number Two has been suspended");
            Thread.sleep(1000);
            new2.resumeThread();
            System.out.println("number Two resumed");
        } catch (InterruptedException e) {
            System.out.println("The main thread has been interrupted");
        }
        //At this point the threads will have to finish their executiongit staus
        try {
            System.out.println("Waiting for thread execution to end");
            new1.thread.join();
            new2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("The Main Thread has been interrupted");
        }
        System.out.println("The Main Thread is exiting");
    }
}


