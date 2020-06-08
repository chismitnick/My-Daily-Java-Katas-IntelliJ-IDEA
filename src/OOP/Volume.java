package OOP;
//Calculates the OOP.Volume of a given OOP.Box based on predefined parameters
/*
A simple Java program to calculate the volume of a OOP.Box, by passing values its instance variables
//This program has been modified to use the key words 'super', 'this' and 'extends'
//and further demonstrates the OOP concept of inheritance
*/

//Written By csamiselo@github.com 2019

class Box1 {
    private double width;
    private double height;
    private double depth;

    public Box1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getvolume() {

        return width * height * depth;
    }
}

// This creates a sub class called volume which extends the fields and properties of
//the OOP.Box1 class

class Volume extends Box1 {

    //An extra field has been added to represent the weight of the box
    double weight;

    //Create a constructor of the volume class
    // include the newly added field

    public Volume(double width, double height, double depth, double kilo) {
        // OOP.Super is used to refer to the default constructor of the super class
        //thus enabling access to its private member variables
        // ***super must always be the first statement called in a subclass constructor
        super(width, height, depth);
        weight = kilo;
    }

    public static void main(String args[]) {

        Volume box = new Volume(10.0, 23, 56, 23.0);

        System.out.println("The volume of the OOP.Box is :" + "  " + box.getvolume() + " " + "cubic centimetres");
        System.out.println("The box weighs:" + " " + box.weight + "kg");


    }

}