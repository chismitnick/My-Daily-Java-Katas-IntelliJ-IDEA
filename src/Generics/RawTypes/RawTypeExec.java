package Generics.RawTypes;

//Demonstrate raw types
//csamiselo@github.com
public class RawTypeExec {
    public static void main(String[] args) {
        //Create generic type objects of different types
        GenRaw<Integer> integerGenRaw = new GenRaw<Integer>(26);
        GenRaw<String> stringGenRaw = new GenRaw<String>("This a generic raw class string value");

        //GenRaw<Double> doubleGenRaw = new GenRaw<Double>(57.8);

        /*Limit the use of raw types to those cases in which you must
          mix legacy code with newer generic code*/

        // create raw-types using the 'raw' key word
        GenRaw raw = new GenRaw(57.8);

        double v = (Double) raw.getVal();
        System.out.println("The value of the double raw is:" + v);

        System.out.println("The value of the integer raw is:" + integerGenRaw.getVal());
        System.out.println(stringGenRaw.getVal());
    }

}
