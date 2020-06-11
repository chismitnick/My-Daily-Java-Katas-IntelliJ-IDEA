package Generics.BoundedWildCards;

//The class defines an array that holds coordinate objects
public class Coordinates<T extends ThreeDimension> {
    T[] coordinates;

    Coordinates(T[] o) {
        coordinates = o;
    }

    //Coordinate objects
    //displays the X and Y coordinates for
    //each element in the coordinate array of a Coordinate object
    static void display2DCoordinates(Coordinates<?> c) {
        for (int i = 0; i < c.coordinates.length; i++)
            System.out.println("The coordinates of the two dimensional object are " + " " +
                    c.coordinates[i].x + " " +
                    c.coordinates[i].y);

    }

    //Displays the X,Y,Z coordinates of
    //extends clause has been added to the wildcard in the declaration of
    //parameter c.
    static void display3DCoordinates(Coordinates<? extends ThreeDimension> c) {
        for (int i = 0; i < c.coordinates.length; i++)
            System.out.println("The coordinates of the three dimensional object are" + " " +
                    c.coordinates[i].x + " " +
                    c.coordinates[i].y + " " +
                    c.coordinates[i].z);
    }


    static void display4DCoordinates(Coordinates<? extends FourDimension> c) {
        for (int i = 0; i < c.coordinates.length; i++)
            System.out.println("The coordinates of the four dimensional object are" + " " +
                    c.coordinates[i].x + " " +
                    c.coordinates[i].y + " " +
                    c.coordinates[i].z + " " +
                    c.coordinates[i].z);
    }
}
