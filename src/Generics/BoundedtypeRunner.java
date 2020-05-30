package Generics;
// Implement the BoundedType Generic class
//Calculates the average of an array and returns the result as a double

public class BoundedtypeRunner {
    public static void main(String[] args) {

        //Average of array of integers
        Integer intNums[] = {1,2,4,6,8,10};
        BoundedTypes<Integer>intObject = new BoundedTypes<>(intNums);
        double z = intObject.ComputeAverage();
        System.out.println("The average of the integer array is :" + z);

        Double dubNums[] = {1.2,2.3,3.4,4.5,6.7};
        BoundedTypes<Double>doubObject = new BoundedTypes<>(dubNums);
        double s = doubObject.ComputeAverage();
        System.out.println("The average of the double array is :" + s);


    }

}
