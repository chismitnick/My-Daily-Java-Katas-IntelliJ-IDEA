package Annotations;
/*
You can obtain all annotations that have RUNTIME retention that are associated with an
item by calling getAnnotations( ) on that item. It has this general form:
Annotation[ ] getAnnotations( )
It returns an array of the annotations. getAnnotations( ) can be called on objects of type

getAnnotations( )
returns an array of Annotation objects
 */


import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//first annotation with a Retention policy of RUNTIME
@Retention(RetentionPolicy.RUNTIME)
@interface MyIntAnno {
    String displayStringVal();
    int displayInt();
    double displayDoub();
}

//second annotation with with RUNTIME retention policy
@Retention(RetentionPolicy.RUNTIME)
@interface MyIntAnno2 {
    boolean truth();
}

@MyIntAnno(displayDoub = 34.6,displayInt = 43,displayStringVal = "Class Annotation")
public class ThirdReflect {

    @MyIntAnno(displayStringVal = "Method Annotation",displayInt = 23,displayDoub = 23.87)
    @MyIntAnno2(truth = true)
    public static void thatMethod(String text,int IntValue,double DoubleValue){
        ThirdReflect thirdReflect =new ThirdReflect();
        try {

            //to get all annotation of a particular type and return them in an array
            Annotation annotation[] = thirdReflect.getClass().getAnnotations();

            //Display all annotations for thirdReflect
            System.out.println("Display all annotations for ThirdReflect Class");

            //for loop to iterate structure
            for(Annotation a: annotation)
                System.out.println(a);

            System.out.println("///////////");


            //Display method annotations for thatMethod along with its associated members and return an array
            Method m  =  thirdReflect.getClass().getMethod("thatMethod", String.class, int.class, double.class);
                    annotation = m.getAnnotations();


            System.out.println("All annotations for thatMethod");

            // for loop to iterate through the structure
            for(Annotation a: annotation)
                System.out.println(a);

        } catch ( NoSuchMethodException e){
            System.out.println();


        }
    }


    public static void main(String[] args) {
        thatMethod("Annotations are Anotated",34,56.8);
    }
}

