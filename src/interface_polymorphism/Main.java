package interface_polymorphism;

public class Main implements Interface {
	 int a=80;
	 final int b=44;
	@Override
	public void car() {
		System.out.println("My first car");	
	}
	@Override
	public void car(int model) {
		System.out.println("Hyundai "+model);
		
	}
	public  void bike() {		//interface default class override
		System.out.println("My first bike in main class");
		
	}
	static void cycle() {
		System.out.println("My first cycle in main class");
	}
	public static void main(String[] args) {
		Main ma= new Main();
		ma.bike();
		ma.bike(" value");
		ma.car();
		ma.car(12);
		System.out.println(ma.a);
		Interface.cycle();
		cycle();
		System.out.println(ma.b);
		System.out.println(Interface.b);
	}
}
