package sample;

public class Second {

	public static void main(String[] args) {
		//System.out.println("hi");
		/*int x= 10;
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10*/
		
		/*int a=10;
		int b=5;
		System.out.println(a+b);//15  
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		System.out.println(a%b);//0 */
		
		/*System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  */
		
		/*System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2 */
		
		/*int num1 =1;
		int num2 = 2;
		System.out.println("num1 > num2 is " + (num1 > num2));
		System.out.println("num1 < num2 is " + (num1 < num2));
		System.out.println("num1 >= num2 is " + (num1 >= num2));
		System.out.println("num1 <= num2 is " + (num1 <= num2));
		System.out.println("num1 == num2 is " + (num1 == num2));
		System.out.println("num1 != num2 is " + (num1 != num2));*/
		
		/*int a = 10, b = 20, c = 20, d = 0;
		 
        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
 
        // using logical AND to verify
        // two constraints
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
     // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));*/
		
		int n1 = 5, n2 = 10, max;
		
		System.out.println("First num: " + n1);
		System.out.println("Second num: " + n2);
		// Largest among n1 and n2
		max = (n1 > n2) ? n1 : n2;
		
		// Print the largest number
		System.out.println("Maximum is = " + max);


	}

}
