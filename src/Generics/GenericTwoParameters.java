package Generics;
// Its is possible to declare more than one parameter type when using Generics
//this can be done using a comma separated list

//generic class with two type parameters
public class GenericTwoParameters<T,V> {
    T object1;
    V object2;

    //Pass the constructor a reference


    public GenericTwoParameters(T ob1, V ob2) {
       object1 = ob1;
       object2 = ob2;
    }

    //show the types of T an V
    void  showTypes(){
        System.out.println("The type of T is: " + object1.getClass().getName());


        System.out.println("The type of V is: " + object2.getClass().getName());
    }

    T getob1(){
        return object1;
    }

    V getob2(){
        return  object2;
    }


}
