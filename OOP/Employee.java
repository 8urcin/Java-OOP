package OOP;

public class Employee {
	private String name;
	private String surname;
	private String department;
	private int salary;
	
	
	public Employee(String name, String surname, String department, int salary) {
	this.name = name;
	this.surname = surname;
	this.department = department;
	this.salary = salary;
	}

	public void showInfos() {
		System.out.println("Informations...");
		System.out.println("Name: " + this.name);
		System.out.println("Surname: " + this.surname);
		System.out.println("Department: " + this.department);
		System.out.println("Salary: " + this.salary); 
		}
	
	public void showInfosMan() {
		System.out.println("Informations of Managers...");
		System.out.println("Name: " + this.name);
		System.out.println("Surname: " + this.surname);
		System.out.println("Department: " + this.department);
		System.out.println("Salary: " + this.salary); 
		}
	
}