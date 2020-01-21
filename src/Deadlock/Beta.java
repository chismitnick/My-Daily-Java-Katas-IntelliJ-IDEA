package Deadlock;

//suppose one thread enters the monitor on object X and another thread enters
//the monitor on object Y. If the thread in X tries to call any synchronized method on Y, it will
//block as expected. However, if the thread in Y, in turn, tries to call any synchronized method
//on X, the thread waits forever, because to access X, it would have to release its own lock on Y
//so that the first thread could complete

public class Beta {
    synchronized void bar(Alpha alpha){
        String name = Thread.currentThread().getName();
        System.out.println(name +"Ended Beta.bar");

        try{
            Thread.sleep(100);
        } catch ( Exception e){
            System.out.println("Beta has been interrupted");
        }
        System.out.println(name + "Trying to call Alpha.last");
        alpha.last();
    }
    synchronized void last(){
        System.out.println("Inside A.last");
    }
}
