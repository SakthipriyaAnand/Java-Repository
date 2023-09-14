package inheritance_git;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		Employee em=new Employee();
		em.privatejob();
		em.companyName();
		em.employeeId();
		em.salary();
		System.out.println(em.a);
		
		Employee.govtjob();
		Employee.employeename();
		System.out.println(Employee.b);

	}

}
class Work{

	public int a=12;
	static int b=11;
	
	public void privatejob() {
		System.out.println("It's a Private Job");
	}
	
	public static void govtjob() {
		System.out.println("It's  government job");
	}
}

class Company extends Work{
	public void companyName() {
		System.out.println("Shimakh Technology");
	}
	
}

class Employee extends Company{
	public static void employeename() {
		System.out.println("Sakthi Priya");
	}
	public void employeeId() {
		System.out.println("Id:12");
	}
	void salary() {
		System.out.println("salary Details");
	}
}