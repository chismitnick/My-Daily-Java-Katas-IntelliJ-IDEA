package EnumInheritance;

public enum Pizzas {
    Margarita(100), Hawaiian(80), Bacon(95),Mushroom(55),Chicken(60), Vegetarian(80);

    private  int price;
    Pizzas(int p ) {
        price = p;
    }
    int getPrice(){
        return  price;
    }
}
