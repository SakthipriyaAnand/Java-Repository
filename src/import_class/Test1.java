package import_class;

import sample.Test2;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("First Test");
		Test2 t2=new Test2(); //we need to import Test2 class because it is outside package
		t2.case1();
		Test1_2 t3 = new Test1_2();// this method is inside the package so no need to import
		t3.case2();
	}

}
