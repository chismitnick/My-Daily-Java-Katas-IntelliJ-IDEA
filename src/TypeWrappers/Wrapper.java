package TypeWrappers;
//Demonstrate the usage of type wrappers in java
//using type wrapper class method getValue() to obtain the value of  a primitive type
// csamiselo@github.com Feb 2020
public class Wrapper {
    public static void main(String[] args) {
         Integer integer = new Integer(100);

         int i  = integer.intValue();

        System.out.println(i + " " + integer);
    }
}
