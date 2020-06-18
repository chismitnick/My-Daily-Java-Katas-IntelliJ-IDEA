package Generics.RawTypes;
//In order to make legacy code work with generics
//Java allows the usage of a generics class without any type arguments
//csamiselo@github.com 2020

class GenRaw<T> {
    T t;

    public GenRaw(T o) {
        t = o;
    }

    T getVal() {
        return t;
    }
}
