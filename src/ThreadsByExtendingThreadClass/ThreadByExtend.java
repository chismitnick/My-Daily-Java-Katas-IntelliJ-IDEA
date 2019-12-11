package ThreadsByExtendingThreadClass;/*
* A demonstration of how to create a thread by extending the thread class
*
* csamiselo@github.com
* */

public class ThreadByExtend extends Thread {

     ThreadByExtend() {
         //create a secondary thread
         super("This is new thread");
         System.out.println("This the child thread" +this);

         //method used to start thread execution
         start();
    }

    //The entry point /execution start point for the secondary thread
    public void run(){
         try {
             for(int x = 6;x>0;x--) {
                 System.out.println("Values from the secondary thread :" +x);
                 Thread.sleep(500);
             }
            //catch the interrupted exception which may be thrown as a result of using the thread.sleep() method
         } catch(InterruptedException e) {
             System.out.println("The secondary thread has been exited");
         }
         }
    }

