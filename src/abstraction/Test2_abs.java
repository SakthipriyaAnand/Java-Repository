package abstraction;

public  class Test2_abs extends TestMain_abs{
	//public abstract class Test2_abs extends Test1_abs  {	//not possible using abstract
public void classB() {
		System.out.println("ClassB in abstract");
	}

	public static void main(String[] args) {
		Test2_abs t1= new Test2_abs();
		t1.classB();
		t1.classA();
		t1.classC();
		//TestMain_abs tm = new TestMain_abs();
		
	}

}
