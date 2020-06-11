package Generics.BoundedWildCards;

//Class representing four dimensional coordinates
public class FourDimension extends ThreeDimension {
    int v;

    FourDimension(int a, int b, int c, int d) {
        super(a, b, c);
        d = v;
    }
}
