package interface_git;

public class Day3 implements Fruits,Vegetables {
	public void grapes() {
		System.out.println("Grapes");
		
	}
	public void pineapple() {
		System.out.println("pineapple");
	}
	public void beetroot() {
		System.out.println("beetroot");
	}
	public void raddish() {
		System.out.println("raddish");
	}
	public static void main(String[] args) {
		Day3 vf=new Day3();
		vf.beetroot();
		vf.raddish();
		vf.grapes();
		vf.pineapple();

	}
}
