package OOP;

/*
A simple program to demonstrate how to access static member variables using their class
*/
//Written By csamiselo@github.com 2019
class StaticMethod {
    static int j = 13;
    static int k = 55;

    static void printValues() {
        System.out.print("The value of j is:" + " " + j);
    }
}

/*   variable can be accessed in
the same way by use of the dot operator on the name of the class */
class StaticMeth2 {
    public static void main(String[] args) {
        StaticMethod.printValues();
        System.out.println("The value of k is :" + " " + StaticMethod.k);
    }
}