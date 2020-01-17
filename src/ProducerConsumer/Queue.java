/* Implementation of Queue class
which is the class whose access we want to synchronize using
a producer and consumer class
 C Samiselo 2020
 csamiselo@github.com
  */

package ProducerConsumer;

public class Queue {
    int a;
    boolean setValue = false;

    //Inside get( ), wait( ) is called. This causes its execution to suspend until Producer notifies
    //  you that some data is ready. When this happens, execution inside get( ) resumes. After the
    //data has been obtained, get( ) calls notify( )
    synchronized int get() {
        while (!setValue)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception has been caught");
            }
        System.out.println("Got this value:" + a);
        setValue = false;
        notify();
        return a;
    }

    synchronized void put(int a) {
        while (setValue)
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception as been caught");
        }

        this.a = a;
        setValue = true;
        System.out.println("Put the value of:" + a);
        notify();
    }
}
