package ThreadSync;

public class Runner {
    public static void main(String[] args) {

        Program1 target = new Program1();
        Program2 program1 = new Program2(target, "Good");
        Program2 program2 = new Program2(target, "Morning");
        Program2 program3 = new Program2(target, "World");
        try {
            program1.t.join();
            program2.t.join();
            program3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

