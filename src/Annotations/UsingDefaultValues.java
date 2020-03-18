package Annotations;

/*

NOTE:* methods getAnnotation( ) and getAnnotations( ) used by the preceding examples are
defined by the AnnotatedElement interface,defined in java.lang.reflect

Demo of how to initialize the the annotation with default values


 We can give annotation members default values that will be used if no value is specified
when the annotation is applied.
 */


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface DefaultValAnno{
    String showStr() default  "This is default value string";
    int showInt() default 45;
}



public class UsingDefaultValues {

//// Annotate a method using the default values.
@DefaultValAnno()
    public static void thisMethod(){
        UsingDefaultValues usingDefaultValues = new UsingDefaultValues();

            //// Obtain the annotation for this method
    //// and display the values of the members.
        try
        {
            Class<?>c = usingDefaultValues.getClass();

            Method m = c.getMethod("thisMethod");

            DefaultValAnno def = m.getAnnotation(DefaultValAnno.class);

        } catch( NoSuchMethodException e){
            System.out.println("Method not found");
        }

    }

    public static void main(String[] args) {
        thisMethod();
    }


}



