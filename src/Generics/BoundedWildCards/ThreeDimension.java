package Generics.BoundedWildCards;
//Class representing three dimensional coordinates

public class ThreeDimension extends TwoDimension {
    int z;

    ThreeDimension(int a, int b, int c) {
        super(a, b);
        z = c;
    }


}
