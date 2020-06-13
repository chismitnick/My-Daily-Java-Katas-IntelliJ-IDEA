package Generics.GenericInterfaces;

//Create a class that implements the generic interface
//csaimselo@github.com
public class GenImplement<T extends Comparable<T>> implements MinimumMaxim<T> {
    T values[];

    public GenImplement(T[] o) {
        values = o;
    }

    public T minimum() {
        T t = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(t) < 0) t = values[i];
        return t;
    }

    public T maximum() {
        T t = values[0];

        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(t) > 0) t = values[i];
        return t;
    }
}
