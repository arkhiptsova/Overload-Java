package FeetNumber;
/*
Mila Arkhiptcova
overloaded Java methods (four different methods) that return the difference of two parameters. 
Your methods should contain the logic to return the difference of the larger parameter – 
smaller parameter, regardless of parameter order. 
09/24/2019
Bellevue University
OverloadJava.java
*/
public class OverloadJava {

	
	//method with parameters type int and return type int
    public static int substruction(int a, int b) {
    	if (a>b) {
    		return a-b;
    	}if (a<b) {
    		return a-b;  		
    	} return a-b;
	
} 		//overload current method with parameters type double and return type double
    public static double substruction(double a, double b) {
    	if (a>b) {
    		return a-b;
    	}if (a<b) {
    		return a-b;  		
    	} return a-b;
}
  //overload current method with parameters type double and int, and return type double
	public static double substruction(int a, double b) {
    	if (a>b) {
    		return a-b;
    	}if (a<b) {
    		return a-b;  		
    	} return a-b;
		}
	//overload current method with parameters type double and int, and return type double
	public static double substruction(double a, int b) {
    	if (a>b) {
    		return a-b;
    	}if (a<b) {
    		return a-b;  		
    	} return a-b;
		}
	
	public static void main(String[] args) {
		// testing out overloaded methods with different numbers and types
		System.out.println("Method with int int and return int");
		System.out.println("The difference between a and b is  "+ substruction(7,8));
		System.out.println("The difference between a and b is  "+ substruction(8,7));
		System.out.println("The difference between a and b is  "+ substruction(8,8) +"\n");
		System.out.println("The overloaded method with double double and return double");
		System.out.println("The difference between a and b is  "+ substruction(4.1,6.1));
		System.out.println("The difference between a and b is  "+ substruction(5.1,6.1));
		System.out.println("The difference between a and b is  "+ substruction(5.1,6.1)+"\n");
		System.out.println("The overloaded method with int double and return double");
		System.out.println("The difference between a and b is  "+ substruction(10,6.9));
		System.out.println("The difference between a and b is  "+ substruction(6, 10.1));
		System.out.println("The difference between a and b is  "+ substruction(10,9.9)+"\n");
		System.out.println("The overloaded method with double int  and return double");
		System.out.println("The difference between a and b is  "+ substruction(2.1,4));
		System.out.println("The difference between a and b is  "+ substruction(5.1,9));
		System.out.println("The difference between a and b is  "+ substruction(7.1,6)+"\n");


	}
}



