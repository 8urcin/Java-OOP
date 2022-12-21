package OOP2;

public class Main {
	
	public static void main(String[] args) {
		Cat cat = new Cat(false, "meat", 4, "pink");

		System.out.println("Cat is Vegetarian?" + cat.isVegeterian());
		System.out.println("Cat eats " + cat.getEats());
		System.out.println("Cat has " + cat.getNumOfLegs() + " legs.");
		System.out.println("Cat color is " + cat.getColor());
	}
}
