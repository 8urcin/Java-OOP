package OOP;

public class Manager extends Employee{
	private int numofemployees; //bilgi ekleme
	
	
	public Manager(String name, String surname, String department, int salary, int numofemployees){
		
		super (name, surname, department, salary);
		this.numofemployees = numofemployees;
		
		
		
		
	}
	@Override
	public void showInfos() {
		/*System.out.println("Informations of Managers...");
		System.out.println("Name: " + getName());
		System.out.println("Surname: " + getSurname());
		System.out.println("Department: " + getDepartment());
		System.out.println("Salary: " + getSalary()); */
		
		super.showInfos(); //bu üstü çağıran özellik
		System.out.println("Salary: " + this.numofemployees); //kendimiz tanımladığımmız için yhisle alıyoruz
		
	}
	public void raiseSalary(int amount) {
		System.out.println("Çalışanlara "+ amount + "TL zam yapıldı.");
	}
	

}
