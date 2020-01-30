package EnumAreClassTypes;

//a Java enumeration is a class type
//The fact that enum
//defines a class gives the Java enumeration extraordinary capabilities
//You can give them constructors, add instance variables and methods, and even implement interfaces

enum Cars {
    Mercedes(9000),Audi(6500),Toyota(4500),Mitsubishi(3500),Chrysler(6500),Ferrari(15000);

    //instance variable within enum
    private int price; //the price of each vehicle

    //Constructor
    Cars(int p) {
        price = p;
    }

    //Overloaded Constructor called when no argument is passed
    Cars(){
        price = -1;
    }

    public int getPrice() {
        return price;
    }

}
