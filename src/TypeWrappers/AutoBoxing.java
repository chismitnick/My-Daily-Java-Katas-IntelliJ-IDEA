package TypeWrappers;
/*
JDK 5, Java added two important features: autoboxing and auto-unboxing.
Autoboxing is the process by which a primitive type is automatically encapsulated (boxed)
into its equivalent type wrapper whenever an object of that type is needed.
Auto unboxing is the opposite of this process,
There is no need to call a method such as intValue( ) or doubleValue( )
This program is demonstration of that concept
csamiselo@github.com Feb 2020
 * */

public class AutoBoxing {
    public static void main(String[] args) {
        //Autoboxing
        Integer integer = 100;
        //Auto-unboxing
        int i = integer;
        System.out.println(i + " " + integer);

    }



}
