package Enums;

public class FruitEnumRunner {
    //Once an enumeration is defined you can create a variable of that type
    public static void main(String[] args) {
        Fruit fr;
        fr = Fruit.Apple;

        //Output an enum value
        System.out.println("The value of fr is :" +fr);
        System.out.println();

        //You can also compare two enum values
        if(fr == Fruit.Apple)
            System.out.println("The current value of fr is: Apple");

        //Enums ca also be used to control the operation of a switch statement
        switch(fr) {
            case Apple:
                System.out.println("Apple is red or green");
                break;
            case Banana:
                System.out.println("Banana is yellow");
                break;
            case Strawberry:
                System.out.println("Strawberry's are red");
            case Mango:
                System.out.println("Mango's are a good source of fibre");
                break;
        }
        }

    }


