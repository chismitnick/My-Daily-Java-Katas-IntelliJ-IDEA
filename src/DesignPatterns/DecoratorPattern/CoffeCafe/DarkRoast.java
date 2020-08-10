package DesignPatterns.DecoratorPattern.CoffeCafe;

//CLass to make dark roast coffe
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

