package Generics;

public class GenericClassRunner {
    public static void main(String[] args) {

        //Create a GenericsClass reference of type Integer
        GenericsClass<Integer> runner;

        //create a GenericsClass<Integer> object and assign its reference to runner
        //use of unboxing
        runner = new GenericsClass<Integer>(20);
        runner.showType();

        //get the value in runnerq
        int v = runner.getob();
        System.out.println("value:" + v);


        //Create a GenericsClass reference of type String
        GenericsClass<String> stringRunner;

        //create a GenericClass<String> object and assign its reference to stringRunner
        stringRunner = new GenericsClass<String>("This is generic class");
        stringRunner.showType();

        //get the value for stringRunner

        String str = stringRunner.getob();
        System.out.println("value:" + str);
    }
}
