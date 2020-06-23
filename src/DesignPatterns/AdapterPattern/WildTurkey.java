package DesignPatterns.AdapterPattern;

//The problem a hand is that we want to use the turkey class
//in DuckTestDrive class

public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("Gobble gobble");
	}
 
	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}
