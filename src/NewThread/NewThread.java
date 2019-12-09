package NewThread;

/*
 *
 * A sample program to demonstrate the various methods in which a thread maybe created
 * this can be done in one of two ways :
 * 1.implementing the Runnable interface : To implement Runnable, a class need only implement a
 * single method called run( )
 * 2. Extending the thread class
 *
 * csamiselo@github.com
 * */
public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        //creation of the second thread
        t = new Thread(this, "This the second Thread");
        System.out.println(" This is the child/second thread:" + t);

        //Begin's thread execution
        t.start();

    }

    //The entry point for execution of the second thread
    //the run method is an abstract method in the Runnable interface
    public void run() {
        try {
            for (int k = 6; k > 0; k--) {
                System.out.println("These values are output from the second thread:" + k);
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("The second thread has been interrupted");
        }
        System.out.println("The second thread has been exited");
    }


}


