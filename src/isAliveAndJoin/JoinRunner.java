package isAliveAndJoin;

public class JoinRunner {
    public static void main(String[] args) {
        //create three separate threads and run them
        UseJoin thread1 = new UseJoin("First One");
        UseJoin thread2 = new UseJoin("Second One");
        UseJoin thread3 = new UseJoin("Third One");


        // Use of the isAlive() method to see if a thread is still executing
        System.out.println("Check if thread one is alive:" + thread1.t.isAlive());
        System.out.println("Check if thread two is alive:" + thread2.t.isAlive());
        System.out.println("Check if thread three is alive:" + thread3.t.isAlive());

        //Give a opportunity for the threads to complete executing
        try {
            thread1.t.join();
            thread2.t.join();
            thread3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread has been interrupted");
        }

        System.out.println("First thread is alive" + thread1.t.isAlive());
        System.out.println("Second thread is alive" + thread2.t.isAlive());
        System.out.println("Third thread is alive" + thread3.t.isAlive());

        System.out.println("Main thread is exiting");

    }
}

