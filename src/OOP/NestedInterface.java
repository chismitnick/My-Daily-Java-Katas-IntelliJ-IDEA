package OOP;
/* A simple Java program to implement nested interfaces   */

//Written By csamiselo@github.com 2019

// An interface can be declared a member of a class or another interface
class Alpha {
    public interface Enclosed {

        boolean NonNegative(int x);
    }
}


//When a nested interface is used outside of its enclosing
//scope, it must be qualified by the name of the class or interface of which it is a
//member.
//Fully qualified interface name OOP.Alpha.Enclosed
class Beta implements Alpha.Enclosed {

    public boolean NonNegative(int x) {
        return x < 0 ? false : true;
    }
}


public class NestedInterface {
    public static void main(String[] args) {

        Alpha.Enclosed alp = new Beta();

        if (alp.NonNegative(12)) ;
        System.out.println("The number entered is non-negative ");

        if (alp.NonNegative(-9)) ;
        System.out.println("The number entered is negative and will no be displayed ");

    }
}
