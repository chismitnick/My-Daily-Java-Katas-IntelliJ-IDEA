package Annotations;

/*
The feature was added in JDK 5
enables you to embed supplemental information into a source file
they do not modify the behaviour of the program, leaves the semantics unchanged
 can be useful for source code generation. Also called Metadata
 */

//simple annotation type

//An annotation is created through a mechanism based on the interface
@interface SimpleAnnotate {
    double val();

    int duration();

    String message();


}
