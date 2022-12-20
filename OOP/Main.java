package OOP;

public class Main {
	
	public static void main(String[]args) {
		Employee employee = new Employee("Mustafa", "Murat", "IT", 3000);
		employee.showInfos();
		
		
		System.out.println();
		
		
		Manager manager = new Manager("Murat", "Asım", "IT", 5000);
		manager.showInfosMan();
	}
}
