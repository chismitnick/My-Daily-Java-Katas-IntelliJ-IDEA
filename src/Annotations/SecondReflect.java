package Annotations;
/*
In the preceding the method used has no parameters. Thus, when getMethod( ) was
called, only the methodName name was passed.
However, to obtain a method that has parameters,you must specify class objects representing the types of those parameters as arguments to
getMethod()
*/


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String message();
    double showDoubleValue();
    int showValue();
}


public class SecondReflect {

    @MyAnnotation(message = "This defined in the initial annotation",showDoubleValue = 34.8,showValue = 78)
    public static void myMethod(String message,double DoubleValue,int IntValue){

        //Create an Object representation
        SecondReflect secondReflect = new SecondReflect();

        //reflection using method that has parameters
        try {
            //retain class object
            Class<?> c = secondReflect.getClass();

            //Retain the method with the parameters specified
            Method method = c.getMethod("myMethod", String.class, double.class, int.class);

          MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);

            System.out.println("The values of the annotation are :" + " " + myAnnotation.message() + " " + myAnnotation.showDoubleValue() + " " + " " +  myAnnotation.showValue() );
        } catch (NoSuchMethodException e){
            System.out.println();
        }
    }

    public static void main(String[] args) {
        myMethod("This is a message printed by passing value to an annotation",34.7,67);
    }

}
