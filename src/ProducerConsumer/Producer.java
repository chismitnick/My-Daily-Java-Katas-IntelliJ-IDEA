package ProducerConsumer;

public class Producer implements Runnable {
    Queue q;

    public Producer(Queue q) {
        this.q = q;
        new Thread(this,"Producer").start();
    }

    public void run(){
        int i = 0;

        while(true) {
            // use the put() method to place an ite/object in the queue
            q.put(i++);
        }

        }
    }

