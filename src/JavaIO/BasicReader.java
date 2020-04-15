package JavaIO;
/*Demonstration of how to obtain console input from the user

In early versions of Java input was obtained using a byte stream
to read console input However, for commercial applications,
the preferred method of reading console input is to use
a character-oriented stream. This makes your program easier to
 internationalize and maintain
 ccsamiselo@github.com March 2020
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicReader {
    public static void main(String[] args) throws IOException {

        char c;

        //InputStreamReader,converts bytes to characters


        // BufferedReader is  used  to read characters from the console.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //reading from System.in.Obtain a character- based stream that is attached to the
        // console, wrap System in a BufferedReader object.

        System.out.println("Enter characters and enter 'q' to quit the program");

        // Read the characters using a while loop

        do {
            // BufferedReader supports a buffered input stream
            //Uses read() method defined in Reader Class
            c = (char) bufferedReader.read();
            System.out.println(c);
        } while (c != 'q') ;
        System.out.println("Program Terminated");
    }

}
