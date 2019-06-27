

//Calculates the Volume of a given Box based on predefined parameters


/*
A simple Java program to calculate the volume of a Box, by passing values its instance variables

*/

class Box1 {
    double width;
    double height;
    double depth;
}

// This class declares an object of type Box.
class Volume {
    public static void main(String args[]) {
        Box1 mybox = new Box1();
        double vol;
        // assign values to mybox's instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        // compute volume of box
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);
    }
}