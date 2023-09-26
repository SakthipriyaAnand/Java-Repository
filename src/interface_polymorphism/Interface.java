package interface_polymorphism;

public interface Interface {
	int a=90;
	
//------------overloading in interface variables----------------------
public void car();
public void car(int model);
final int b=33;

//------------overloading in interface default method---------------------

	default void bike() { 
		System.out.println("My first bike");
}
	default void bike(String range) {
		System.out.println("My first bike in high range"+range);
}
	static void cycle() {
		System.out.println("My first cycle");
}

}
