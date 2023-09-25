package abstractionTointerface;

public interface InterfaceClass {
	public int a=12;
	static int c=13;
	void human();
	static void mamals() {
		System.out.println("mamals in Interface class d="+AbstractionClass.d);
	}
	
}

//we cannot call variable in abstract class in interface class 
// only static variables in abstract class is called in interface class