
//Written By csamiselo@github.com 2019

class Cube {

    double width;
    double height;
    double depth;


    //Constructor used when all the dimensions are passed as parameters
    public Cube(double w, double d, double h) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions ar specified
    //Use -1 to represent an empty box
    public Cube() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //Constructor used to create a Cube
    public Cube(double len) {

        width = depth = height = len;
    }

    //Method to calculate the volume
    double volume() {

        return width * depth * height;
    }

}

class ConstructorOverload {

    public static void main(String[] args) {
        //create cube objects using the various constructors

        Cube cube1 = new Cube(2.3, 3.4, 5.6);
        Cube cube2 = new Cube();
        Cube cube3 = new Cube(4);
        double vol;


        //Volume of first cube
        vol = cube1.volume();
        System.out.println("\n The volume of Cube 1 is:" + vol);

        // Volume of second cube
        vol = cube2.volume();
        System.out.println("\n The volume of Cube 2 is:" + vol);

        //Volume of third cube
        vol = cube3.volume();
        System.out.println("\n The volume of Cube 3 is:" + vol);
    }

}