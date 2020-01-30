package EnumAreClassTypes;

public class CarsEnumRunner {
    public static void main(String[] args) {
        Cars cr;

        //Display the price of a Ferrari
        System.out.println("A ferrari costs " + Cars.Ferrari.getPrice() + " dollars. \n");


        //Display the prices of all vehicles
        System.out.println("Here is a list of all available cars and there prices:");
        for(Cars cars : Cars.values())
            System.out.println(cars + " costs " + cars.getPrice() + " dollars. ");

    }
}
