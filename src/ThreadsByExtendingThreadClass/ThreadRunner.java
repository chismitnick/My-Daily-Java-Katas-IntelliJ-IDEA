package ThreadsByExtendingThreadClass;

public class ThreadRunner {
    public static void main(String[] args) {
        new ThreadByExtend();
        try{
            for(int a = 6;a>0;a--) {
                System.out.println("Values from the Primary Thread :" +a);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("The primary thread has been interrupted");

        }
        System.out.println("The primary thread is exiting");
    }
}
