package Generics;

//Demonstration of how to determine if two arrays have the same average
//regardless of their data type using wildcard
public class GenWilCardRun {
    public static void main(String[] args) {
        //Integers
        Integer intnumbers[] = {1,2,3,4,5};
        GenericWildCards<Integer>integ = new GenericWildCards<Integer>(intnumbers);
        double intavg = integ.CalcAvg();
        System.out.println("The average of the integer array is :" + intavg);

        //Doubles
        Double doubnums[] = {1.1,2.2,3.3,4.4,5.5};
        GenericWildCards<Double>doub = new GenericWildCards<Double>(doubnums);
        double doubavg = doub.CalcAvg();
        System.out.println("The average of the double array is :" +doubavg);


        //Floating point numbers
        Float floatnums[] ={1.0F,2.0F,3.0F,4.0F,5.0F} ;
        GenericWildCards<Float>flo = new GenericWildCards<Float>(floatnums);
        double floatavg = flo.CalcAvg();
        System.out.println("The average of the float array is :" +floatavg);

        //Determine the arrays that have the same average
        System.out.println("The averages of the integer and double arrays");
        if(integ.SameAvg(doub))
            System.out.println("Are Equal");
        else
            System.out.println("Are not Equal");

        System.out.println("The averages of the double and float arrays");
        if(doub.SameAvg(flo))
            System.out.println("Are Equal");
        else
            System.out.println("Are not Equal");


        System.out.println("The averages of the float and integer arrays");
        if(flo.SameAvg(integ))
            System.out.println("Are Equal");
        else
            System.out.println("Are not Equal");


    }
}
