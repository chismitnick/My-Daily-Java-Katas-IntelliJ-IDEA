package ProducerConsumer;

public class Consumer implements  Runnable {
    Queue queue;

    Consumer(Queue queue) {
        this.queue = queue;
        new Thread(this).start();
    }
    public  void run() {
        while (true) {
            //Uses the get() method to get an item/object from the queue after receiving notify() from the Producer
            queue.get();
        }


    }
}
