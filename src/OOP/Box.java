package OOP;
/*
Simple class demonstrates multilevel inheritance in Java.
 It begins with the declaration of a OOP.Super Class called OOP.Box
 and uses several constructors to define the box state
*/
//Written By csamiselo@github.com 2019

class Box {

    // The box has 3 main fields length,width and height
    private double width;
    private double height;
    private double depth;

    //Default constructor passing object as an argument
    Box(Box bx) { //object bx is passed as an argument to a constructor
        width = bx.width;
        height = bx.height;
        depth = bx.depth;
    }


    //Constructor that is used when all 3 dimensions are specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Constructor that is used when no dimensions are specified
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //Constructor used to make a OOP.Cube
    Box(double len) {
        width = height = depth = len;
    }

    // method to calculate the volume of the OOP.Box
    double getvolume() {
        return width * height * depth;
    }
}

            /*The following code block defines a class called OOP.BoxWeighted that extends the OOP.Box class
            and adds a weight field to represent the weight of the box.
            Consequently it also defines its own default constructor
            but uses the 'super' key word to pass the newly added field to the constructor
            */

class BoxWeighted extends Box {
    double weight;

    BoxWeighted(BoxWeighted bw) {
        super(bw);
        weight = bw.weight;
    }

    BoxWeighted(double w, double h, double d, double g) {
        super(w, h, d);
        weight = g;
    }

    BoxWeighted() {
        super();
        weight = -1;
    }

    BoxWeighted(double len, double g) {
        super(len);
        weight = g;
    }

    void getweight() {

        System.out.println("The weight of the box is approximately:" + " " + weight + " " + "kg");
    }
}

/*
The OOP.Shipping class extends the OOP.BoxWeighted class and adss a field called cost
to represent the cost of shipping a box.
  */
class Shipping extends BoxWeighted {
    double cost;

    // Construct a clone object
    Shipping(Shipping ship) {
        super(ship);
        cost = ship.cost;
    }

    Shipping(double w, double h, double d, double g, double c) {
        super(w, h, d, g);
        cost = c;
    }

    void getShipCost() {
        System.out.println("The cost of shipment is :" + "ZMK" + cost);
    }

}


class TestShipping {

    public static void main(String[] args) {
        Shipping shp = new Shipping(12.0, 13.9, 15.8, 57.4, 89);


        System.out.println(" The Details of the shipment are as follows:");
        System.out.println(" The volume of the shipment is: " + " " + shp.getvolume() + " " + "cubic centimetres");
        System.out.println("The weight of the shipment is:" + " " + shp.weight + " " + "Kilo grams");
        shp.getShipCost();
    }
}