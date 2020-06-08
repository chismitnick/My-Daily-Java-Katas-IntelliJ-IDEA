package Fundamentals;/*
A simple program to print n numbers of an array using recursive method
*/

//create a class and declare a new array

//Written By csamiselo@github.com 2019
class RecursionTest {
    int values[];

    //constructor class
    RecursionTest(int i) {
        values = new int[i];
    }

    //method containing the return statement to perevent method from executing
//beyond the set bounds 
    void DisplayValues(int i) {
        if (i == 0)
            return;
        else DisplayValues(i - 1);
        //prints all array values
        System.out.println("[" + (i - 1) + "]" + values[i - 1]);
    }

}

// class containing the main method
class Recursion2 {


    public static void main(String[] args) {
        // create a new objevct using the constructor
        RecursionTest ob = new RecursionTest(10);
        int i;

//for loop to recursively increment value 
        for (i = 0; i < 10; i++) ob.values[i] = i;
        ob.DisplayValues(10);

    }


}


