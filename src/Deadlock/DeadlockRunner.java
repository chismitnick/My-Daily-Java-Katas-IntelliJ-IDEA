package Deadlock;
//this class runs the program by creating an Alpha and Beta object

public class DeadlockRunner implements Runnable {
    Alpha a = new Alpha();
    Beta b = new Beta();

    public DeadlockRunner() {
        Thread.currentThread().setName("Main Thread");
        Thread thread = new Thread(this, "RaceThread");
        thread.start();

        a.foo(b); //Obtaining lock on a in the current thread
        System.out.println("In main Thread");
    }
    public void run(){
        b.bar(a);//Obtain lock on b from the other thread
        System.out.println("Back in the Other thread");
    }

    public static void main(String[] args) {
        new DeadlockRunner();
    }
}
