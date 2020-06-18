package Generics.GenSuperClass;
/*Generic classes can be part of a class hierarchy
 just the same way as a non-generic class. In a
 generic hierarchy type arguments must be passed
  up the hierarchy by all sub classes.
 */
//csamiselo@gtihub.com
public class GenSuper<T> {
    T t;

    public GenSuper(T o) {
        t = o;
    }
    T getVar(){
        return t;
    }
}
