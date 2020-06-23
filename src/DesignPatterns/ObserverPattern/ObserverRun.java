package DesignPatterns.ObserverPattern;

public class ObserverRun {
    public static void main(String[] args) {
        System.out.println("This is a demonstration of the Observer pattern");
        Observer observer1 = new Observer();
        Subject subject1 = new Subject();
        subject1.register(observer1);

        System.out.println("Set the flag value = 76");
        subject1.setFlag(76);

        System.out.println("Set the flag value to = 200");
        subject1.setFlag(200);
        subject1.unregister(observer1);
    }
}
