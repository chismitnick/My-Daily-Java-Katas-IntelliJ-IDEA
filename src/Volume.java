

//Calculates the Volume of a given Box based on predefined parameters
/*
A simple Java program to calculate the volume of a Box, by passing values its instance variables
//This program has been modified to use the key words 'super', 'this' and 'extends'
//and further demonstrates the OOP concept of inheritance

*/

class Box1 {
    private  double width;
    private double height;
    private  double depth;

    public Box1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

     double getvolume(){

        return  width*height*depth;
    }
}

// This creates a sub class called volume which extends the fields and properties of
//the Box1 class

class Volume extends Box1 {

    //An extra field has been added to represent the weight of the box
    double weight;

    //Create a constructor of the volume class
    // include the
    public Volume(double width, double height, double depth, double kilo) {

        // Super is used to refer to the default constructor of the super class
        //thus enabling access to its private member variables
        super(width, height, depth);
        kilo = weight;
    }
    public static void main(String args[]) {
        double weight;
    Volume box = new Volume(10.0,23,56,23);

          System.out.println("The volume of the Box is :" + "" + box.getvolume());
          System.out.println("The box weighs:" + "" + box.weight);





    }

}