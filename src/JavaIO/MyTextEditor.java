package JavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
This program demonstrates how to create a simple Console based Text editor.
It creates an array of String objects and then reads in lines of text,
Its stores each line in an array.
it is designed to read up to 100 lines or until
you enter "stop."
It uses a BufferedReader to read from the console.

csamiselo@github.com March 2020
*/
public class MyTextEditor {
    public static void main(String[] args) throws IOException {

        //create a BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Fundamentals.Array reading up to 100 lines
        String string[] = new String[100];
        System.out.println("Enter your text here :");
        System.out.println("Enter 'stop' to terminate the program");

        // Read the lines
        for (int i = 0; i < 100; i++) {
            string[i] = bufferedReader.readLine();

            if (string[i].equals("stop"))
                break;

        }

        System.out.println("The text you entered is here:");

        //Display the lines
        for (int i = 0; i < 100; i++) {
            if (string[i].equals("stop"))
                break;
            System.out.println(string[i]);
        }
        System.out.println("Program terminated");
    }
}




