package Generics.BoundedWildCards;

import static Generics.BoundedWildCards.Coordinates.*;
//An implementation of bounded wildcards
//bounded wildcards are useful when creating a generic type
//that will operate on a class hierarchy
//csamiselo@github.com
public class BoundedWildcard {
    public static void main(String[] args) {

        //Create 2D objects
        TwoDimension twoDimension[] = {
                new TwoDimension(2, 4),
                new TwoDimension(5, 8),
                new TwoDimension(3, 6)
        };
        //Create anew Coordinates object of type TwoDimension
        Coordinates<TwoDimension> twoDimensionCoordinates = new Coordinates<TwoDimension>(twoDimension);
        System.out.println("The coordinates of the 2D object:");
        display2DCoordinates(twoDimensionCoordinates);

        System.out.println("\n");

        //Create 3d Object
        ThreeDimension threeDimension[] = {
                new ThreeDimension(4, 5, 9),
                new ThreeDimension(1, 5, 7),
                new ThreeDimension(4, 14, 19),
        };
        Coordinates<ThreeDimension> threeDimensionCoordinates = new Coordinates<ThreeDimension>(threeDimension);
        System.out.println("the coordinates of the 3D object are:");
        display3DCoordinates(threeDimensionCoordinates);

        System.out.println("\n");

        //Create4 D object
        FourDimension fourDimension[] = {
                new FourDimension(3, 56, 78, 4),
                new FourDimension(4, 6, 8, 10),
                new FourDimension(8, 4, 0, 4)
        };
        Coordinates<FourDimension> fourDimensionCoordinates = new Coordinates<FourDimension>(fourDimension);
        System.out.println("The Cordinates of the 4D object are:");
        display4DCoordinates(fourDimensionCoordinates);
    }

}
