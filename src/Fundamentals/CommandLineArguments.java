package Fundamentals;
// A simple program to display command line arguments

//Written By csamiselo@github.com 2019
class CommandLineArguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);

        }
    }

}