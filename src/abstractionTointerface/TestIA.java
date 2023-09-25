package abstractionTointerface;

public class TestIA extends AbstractionClass {

	@Override
	public void human() {
		System.out.println("Human in Interface Class");
		
	}

	@Override
	void insects() {
		System.out.println("Insects in Abstract class");
		
	}
	
	public static void main(String[] args) {
		TestIA ia= new TestIA();
		ia.animal();
		ia.human();
		ia.insects();
		System.out.println("a= "+InterfaceClass.a);
		System.out.println("b="+ia.b);
		System.out.println("a="+ia.b);
		//System.out.println("b="+AbstractionClass.b); //not possible

	}

	

}
