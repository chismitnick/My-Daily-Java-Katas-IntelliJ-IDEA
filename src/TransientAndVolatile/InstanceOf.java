package TransientAndVolatile;
// Knowing the type of an object during runtime is useful i.e invalid casts
// Can help, deal with certain kinds of errors
// the instanceof operator is used to do this in Java
// the instance of operator is not needed in most programs
// but can be useful when writing generalized routines that work with object of a complex class hierarchy

// csamiselo@github.com April 2020

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;

}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A)
            System.out.println("a is an Instance of A");
        if (b instanceof B)
            System.out.println("b is an Instance of B");
        if (c instanceof C)
            System.out.println("c is an Instance of C");
        if (c instanceof A)
            System.out.println("c can be cast to A");

        if (a instanceof C)
            System.out.println("a can be cast to C");

        System.out.println("????/????????????????????/??????");

        A myA;
        myA = d;
        System.out.println("The value of d has been passed to myA");

        if (myA instanceof D)
            System.out.println("myA is an instance of D ");

        System.out.println("????/????????????????????/??????");

        myA = c;
        System.out.println("the value of c has been passed to myA");

        if (myA instanceof D)
            System.out.println("myA can be cast to D");
        else
            System.out.println("myA cannot be cast to D");
        if (myA instanceof A)
            System.out.println("myA can be cast to A");


        //Check if objects can be cast to Object
        if (a instanceof Object)
            System.out.println("a may be cast to Object");
        if (b instanceof Object)
            System.out.println("b may be casted to Object");
        if (c instanceof Object)
            System.out.println("c may be casted to Object");
        if (d instanceof Object)
            System.out.println("d may be cast to Object");


    }

}