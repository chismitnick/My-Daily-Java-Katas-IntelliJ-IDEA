package ProducerConsumer;


//This class creates instances of the  Queue,Producer and Consumer
public class ProducerConsumerRunner {
    public static void main(String[] args) {
        Queue queue = new Queue();
        new Producer(queue);
        new Consumer(queue);

        System.out.println("Press ctrl-f2 to stop");
    }
}
