package inheritance_git;

public class Hierarical_Inheritance {

	public static void main(String[] args) {
		Student st=new Student();
		st.degree();
		st.name();
		
		Branch bh=new Branch();
		bh.branch1();
		bh.degree();
		
	}

}
class College{
	public void degree() {
		System.out.println("Engineering");
	}
}
class Branch extends College{
	public void branch1() {
		System.out.println("ECE");
	}
}
class Student extends College {
	public void name() {
		System.out.println("My name is Sakthi Priya");
	}
}