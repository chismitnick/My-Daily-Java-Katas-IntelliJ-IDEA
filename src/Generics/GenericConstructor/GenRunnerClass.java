package Generics.GenericConstructor;

public class GenRunnerClass {
    public static void main(String[] args) {
        //use generic constructor which is bound by Number
        //meaning a value of int,float and double is acceptable
        GenericCons genericCons = new GenericCons(100);
        GenericCons genericCons1 = new GenericCons(3F);
        GenericCons genericCons2 = new GenericCons(34.5);

        //Display values
        genericCons.showValue();
        genericCons1.showValue();
        genericCons2.showValue();

    }
}
