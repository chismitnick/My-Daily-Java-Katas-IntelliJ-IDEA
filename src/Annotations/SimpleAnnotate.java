package Annotations;

/*
The feature was added in JDK 5
enables you to embed supplemental information into a source file
they do not modify the behaviour of the program, leaves the semantics unchanged
 can be useful for source code generation. Also called Metadata
 */

//simple annotation type

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//An annotation is created through a mechanism based on the interface

// A retention policy determines at what point an annotation is discarded
// Java defines three
//such policies, which are encapsulated within the java.lang.annotation.RetentionPolicy
//enumeration. They are SOURCE, CLASS, and RUNTIME.


//Thus, RUNTIME retention
//offers the greatest annotation persistence
//Thus, SimpleAnnotate will be available to the JVM during program execution
@Retention(RetentionPolicy.RUNTIME)
@interface SimpleAnnotate {
    double val();

    int duration();

    String message();


}
