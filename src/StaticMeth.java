/* 
A simple program to demonstrate the usage of the stati key word 
*/

class StaticMeth {
static int d;
static int f = 10;

 //A static method
static void method1(int x ) {

    System.out.println("x = " + x);
    System.out.println("d = " + d);
    System.out.println("f = " + f);
}

// static block
static{
System.out.println("Mad static on the set ");
d = f *2;

}

//main method
public static void main(String[] args) {

    method1( 34);
}
}