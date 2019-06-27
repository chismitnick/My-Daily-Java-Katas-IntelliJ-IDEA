/*
A simple program to demonstrate the concept of recursion.
Recursion is the process of defining something in terms of itself.
This concept will be shown using the concept of factorials
*/

class Factorial {
    // declare method to calculate factorial
    int computefactorial(int n) {
        // incase the value of n is 1
        int result;
        if (n == 1)
            return 1;
        //assign the answer to resullt 
        result = computefactorial(n - 1) * n;
        return result;
    }
}

//Class to implement factorial method
class Recursion {
    public static void main(String args[]) {
        //create factorial object
        Factorial f = new Factorial();
        // Print value of factorials
        System.out.println("Factorial of 13 is " + f.computefactorial(13));
        System.out.println("Factorial of 9 is " + f.computefactorial(9));
        System.out.println("Factorial of 7 is " + f.computefactorial(7));
    }
}