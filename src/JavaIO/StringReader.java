package JavaIO;

/*
Demonstrating how to read a string from the keyboard,
using the version of readLine( )
that is a member of the
BufferedReader class

csamiselo@github.com March 2020
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReader {

    public static void main(String[] args) throws IOException {

        String string;

        //Create a BufferedReader object using System.in

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the paragraph that you want to print");
        System.out.println("Enter 'quit' to end the program ");
        System.out.println("??????????????????????????????????");

        do{
            string = bufferedReader.readLine();
            System.out.println(string);

        }while(!string.equals("quit") );
        System.out.println("Program has been terminated by the user");
    }

}
