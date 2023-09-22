package abstraction;

public abstract class Employee {
	
	abstract void calculateSalary();
	abstract void displayInfo();
	
	static void calculateSalary(int salary) {
		System.out.println("Basic salary: "+salary);
	}
	
	static void displayInfo(String Name) {
		System.out.println("Employee Name: "+Name);
	}
	

	public static void main(String[] args) {
		Employee.displayInfo("Sakthi");
		Employee.calculateSalary(22000);
				
		Manager ma =new Manager();
		ma.displayInfo();
		ma.calculateSalary();
			
		Programmer pr=new Programmer();
		pr.displayInfo();
		pr.calculateSalary();
	}

}
//--------------------Class Manager----------------------------------

class Manager extends Employee{

	@Override
	void calculateSalary() {
		System.out.println("salary of Aug: 20000");
		
	}

	@Override
	void displayInfo() {
		System.out.println("Employee Id: 12");
		
	}	
}
//--------------------Class Programmer---------------------------------
class Programmer extends Employee{

	@Override
	void calculateSalary() {
		System.out.println("PF detecution: 2000");
		
	}

	@Override
	void displayInfo() {
		System.out.println("Department: Front-end");
		
	}	
}