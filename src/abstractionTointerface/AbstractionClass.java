package abstractionTointerface;

public abstract class AbstractionClass implements InterfaceClass{
	int b= 11;
	static int d=14;
	abstract void insects();
	
	public void animal() {
		System.out.println("Animals in abstract class a="+InterfaceClass.a);
		
		System.out.println("static interface variable in abstract class c="+InterfaceClass.c);
	}
	
}


//we can call interface class in abstract class using implements keyword
//but we cannot call abstract class in interface class by using any keyword (extends and implements)
//we can use/call all variable in interface class to abstract class