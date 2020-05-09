package Generics;
/*
*the term generics means parameterized types
*they enable you to create classes, interfaces, and methods in which the type of data
 upon which they operate is specified as a parameter
*
*A class,interface, or method that operates on a parameterized type is called generic
*  */

public class GenericsClass<T> {
    T ob; //declare an object of type T

    //pass the constructor a reference to the object fpo type T
    public GenericsClass(T o) {
        ob = o;
    }

    // Return the object

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("The type of T is" + ob.getClass().getName());
    }
}
