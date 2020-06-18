package Generics.GenericInterfaces;


//Generic interfaces are specified just the way you would generic classes
interface MinimumMaxim<T extends Comparable> {
    T minimum();

    T maximum();
}
