package TransientAndVolatile;

/*
*By following import with the keyword static, an import statement can be used to
import the static members of a class or interface.
* They enable us to refer to the static members directly by their names
* without having to qualify them with the name of the parent class
* simplifies syntax
*
*Demonstration of how to use static imports in Java
* csamiselo@github.com April 2020
 */

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class StaticImport {
    //calculate the length of the hypotenuse
    public static void main(String[] args) {
        double side1, side2;
        double hypotenuse;

        side1 = 3.0;
        side2 = 4.0;
        //'sqrt' and 'pow' called with reference to the parent class
        hypotenuse = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println("Given the sides" + " " + side1 + " " + "and" + " " + side2 + " "
                + " " + "the hypotenuse calculated using pythagoras is :" + hypotenuse);
    }

}
