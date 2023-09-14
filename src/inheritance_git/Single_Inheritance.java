package inheritance_git;

public class Single_Inheritance {

	public static void main(String[] args) {
		Child ch=new Child();
		ch.mother();
		ch.daughter();
		Child.father();
		Child.son();
	}

}
class Parent{
	public void mother() {
		System.out.println("My name is Sakthi Priya");
	}
	public static void father() {
		System.out.println("My name is Anand");
	}
}

class Child extends Parent{
	public void daughter() {
		System.out.println("My Daughter name is S.A.Pugazhini");
	}
	public static void son() {
		System.out.println("My son name is S.A.Rangaaeswaran");
	}
	
}