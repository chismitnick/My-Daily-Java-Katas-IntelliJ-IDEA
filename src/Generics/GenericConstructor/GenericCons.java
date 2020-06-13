package Generics.GenericConstructor;
//Implementation of a generic constructor
public class GenericCons {
    private  double value;


    //generic constructor
    <T extends Number>GenericCons(T argument){
        value = argument.doubleValue();
    }

    void showValue(){
        System.out.println("The value is :" + value);
    }
}
