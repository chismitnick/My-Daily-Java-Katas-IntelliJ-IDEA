package Generics;
//Using bounded types allows aus to limit the types that can be passed to a type parameter
// This concept will e demonstrated by creating a generic class that can compute
//the average of numbers in a array of any type
/*
When specifying a type parameter,
you can create an upper bound that declares the
superclass from which all type arguments
must be derived
*/
//csamiselo@github.com May 2020

// specifying Number as an upper bound super class
public class BoundedTypes<T extends Number> {
    T[] numbers;

    //pass a constructor reference
    BoundedTypes(T[] o) {
        numbers = o;
    }

    //method to compute the average

    double ComputeAverage() {
        double total = 0.0;
        for (int i = 0; i < numbers.length; i++)
            total += numbers[i].doubleValue();

        return total / numbers.length;

    }
}



