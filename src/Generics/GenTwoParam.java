package Generics;
//demonstrate using multiple parameter types using Generics

public class GenTwoParam {
    public static void main(String[] args) {
        //Declare a gentwoparameters object an use auto boxing to pass values
        GenericTwoParameters<Integer,String> paramObject = new GenericTwoParameters<Integer,String>(70,"This is a string");

        //display the types of the parameters
        paramObject.showTypes();

        //obtain the values
        int v = paramObject.getob1();
        System.out.println("value of T: " +v);


        String str = paramObject.getob2();
        System.out.println(" value of V:" + str);


    }
}
