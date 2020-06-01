package Generics;

// The preceding program is now extended to use wildcards determine
//Whether the averages of two arrays are equal independent of their type
public class GenericWildCards<Y extends Number> {

    Y[] numbers;

    //pass constructor a reference to the array type of Number subclass
    public GenericWildCards(Y[] numbersObject) {
        numbers = numbersObject;
    }


    // return the average as a double regardless of the datatype
    double CalcAvg() {
        double total = 0.0;

        for (int i = 0; i < numbers.length; i++)
            total += numbers[i].doubleValue();
        return total / numbers.length;

    }

    //use the wildcard to determine if the averages of two arrays are the same
    // the wildcard character is a denoted using a  '?' in Java
    boolean SameAvg(GenericWildCards<?>sameavg){
        if(CalcAvg() == sameavg.CalcAvg())

            return true;
        return  false;
    }

}

