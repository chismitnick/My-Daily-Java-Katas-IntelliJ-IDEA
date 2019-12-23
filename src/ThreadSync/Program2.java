package ThreadSync;

public class Program2 implements Runnable {
    String msg;
    Program1 program1;
    Thread t;

    public Program2(Program1 prog1, String s) {
        msg = s;
        program1 = prog1;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        program1.call(msg);
    }
}
