package OOP2;

public class Animal {
	private boolean vegetarian;
	private String eats;
	private int numOfLegs;
	
	
	
	public Animal(boolean veg, String food, int legs) {
		this.vegetarian = veg;
		this.eats = food;
		this.numOfLegs = legs;
		
	}
	
	public boolean isVegeterian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public String getEats() {
		return eats;
		
	}
	public void setEats(String eats) {
		this.eats = eats;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int noOfLegs) {
		this.numOfLegs = noOfLegs;
	}
	
	
}
