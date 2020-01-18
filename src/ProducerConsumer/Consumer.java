package ProducerConsumer;

public class Consumer implements  Runnable {
    Queue queue;

    Consumer(Queue queue) {
        this.queue = queue;
        new Thread(this).start();
    }
    public  void run() {
        while (true) {
            queue.get();
        }


    }
}
