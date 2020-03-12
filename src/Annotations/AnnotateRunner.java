package Annotations;

//An annotation cannot include an extends clause. However, all annotation types
//automatically extend the Annotation interface.
//Thus, Annotation is a super-interface of all annotations

//Prior to
//JDK 8, annotations could be used only on declarations.
//It is declared within the java.lang.annotation package

//using the annotation @SimpleAnnotate declared using @interface annotation


//When you apply an annotation, you give values to its members
@SimpleAnnotate(val = 2.5 ,duration = 3,message = "This is a message passed from an annotation")


//Once you have declared an annotation, you can use it to annotate something
public class AnnotateRunner {

    @SimpleAnnotate(val = 2.5 ,duration = 3,message = "This is a message passed from an annotation")
   public void  myMethod(){
        System.out.println();




    }


}
