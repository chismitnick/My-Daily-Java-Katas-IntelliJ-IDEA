package EnumInheritance;

//Demonstrate of ordinal(),compareTo() and equals() methods from the enum class

public class PizzaEnumRunner {
    public static void main(String[] args) {
        Pizzas pizzas, pizzas1, pizzas2;

        //Display the ordinal values
        System.out.println("The ordinal values in the Pizzas Enum are the following");

        //For each loop used to iterate through the structure
        for (Pizzas p : Pizzas.values()) {
            System.out.println( p + " " + p.ordinal());
        }
        pizzas = Pizzas.Margarita;
        pizzas1 = Pizzas.Mushroom;
        pizzas2 = Pizzas.Bacon;

        System.out.println();

        //Use the compareTo() and equals() methods to make comparisons on the enum values
         if (pizzas.compareTo(pizzas1) < 0 )
             System.out.println(pizzas + " comes before " + pizzas1);

         if(pizzas.compareTo(pizzas2) > 0)
             System.out.println(pizzas + "comes before" + pizzas2);

        if(pizzas.compareTo(pizzas2) == 0)
            System.out.println(pizzas + "equals" + pizzas);

        System.out.println();

        if(pizzas.equals(pizzas1))
            System.out.println("Error");

        if(pizzas.equals(pizzas2))
        System.out.println(pizzas  + "equals" + pizzas2);

        if(pizzas == pizzas2)
            System.out.println(pizzas + "==" + pizzas2);
    }

}
