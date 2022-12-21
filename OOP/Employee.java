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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void showInfosMan() {
		System.out.println("Informations of Managers...");
		System.out.println("Name: " + this.name);
		System.out.println("Surname: " + this.surname);
		System.out.println("Department: " + this.department);
		System.out.println("Salary: " + this.salary); 
		}
	
	
	
		
		
		
		
		
	
	
}