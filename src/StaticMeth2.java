/*
A simple program to demonstrate how to access static member variables using their class
*/
class StaticMethod {
    static int j = 13;
    static int k = 55;

    static void printVlaues() {
        System.out.print("The value of j is:" + " " + j);
    }
}

/*   variable can be accessed in
the same way by use of the dot operator on the name of the class */
class StaticMeth2 {
    public static void main(String[] args) {
        StaticMethod.printVlaues();
        System.out.println("The value of k is :" + " " + StaticMethod.k);
    }
}