package Annotations;
/*
if an annotation specifies a retention policy of RUNTIME, then it can be queried at run time
by any Java program through the use of reflection. Reflection is the feature that enables
information about a class to be obtained at run time.

The reflection API is contained in
the java.lang.reflect package

*/


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface ThisAnnotation {
    String message();

    int showValue();
}

public class Reflection {

    //Annotate a method
    @ThisAnnotation(message = "This printed using reflection", showValue = 23)
    public static void myMethod() {
        Reflection reflection = new Reflection();


        //// Obtain the annotation for this method
        //// and display the values of the members.

        try {
            // Step 1 :Get a class object that represents this class
            Class<?> c = reflection.getClass();

            //Step 2:get a method that represents the method in the class
            Method m = c.getMethod("myMethod");

            // Step 3: get the annotation for this class
            ThisAnnotation annotation = m.getAnnotation(ThisAnnotation.class);


            //Step 4: Print the annotation values
            System.out.println(annotation.message() + " " + " " + annotation.showValue());
        } catch (NoSuchMethodException ex) {
            System.out.println("no such method exists within the class ");

        }


    }

    public static void main(String[] args) {
        myMethod();
    }
}
