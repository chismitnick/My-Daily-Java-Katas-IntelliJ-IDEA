package MutipleThread;
/* *
A program to demonstrate hoe to create multiple threads

csamiselo@github.com
/
 */
public class MultiThread extends  Thread {

    String name; //name ot the thread
    Thread t ;

    public MultiThread(String nameofThread) {
        name = nameofThread;
        t = new Thread(this, name);
        System.out.println("Thread:" +t);
        t.start();// start the thread execution
    }


    public void run(){
        try{
        for(int x = 5;x>0;x--) {
            System.out.println(name + ": " +x);
            Thread.sleep(500);
        }
        } catch(InterruptedException e) {

            System.out.println("Thread has been interrupted" +name);
        }
        System.out.println("Thread exited");
        }
    }

