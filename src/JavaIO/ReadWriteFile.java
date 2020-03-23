package JavaIO;

import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) {
        int passMark = 80;
        System.out.println("Enter mark obtained: ");
        Scanner scanner = new Scanner(System.in);

        int enteredMark=scanner.nextInt();
        if(enteredMark >= passMark){
            System.out.println("Pass mark obtained");

        }else {
            System.out.println("Fail");
        }


    }
}
