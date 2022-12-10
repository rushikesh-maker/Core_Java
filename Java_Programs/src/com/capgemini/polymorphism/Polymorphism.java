package com.capgemini.polymorphism;
 
class Operations{
	int num1, num2;
	double number1, number2;
	
	public void calc(int num1, int num2) {
		int add;
		add = num1 + num2;
		System.out.println("Addition of two num : "+add);
	}
	
	public void calc(double number1, double number2) {
		double sub;
		sub = number1 - number2;
		System.out.println("Substaction of two num : "+sub);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
			Operations ob = new Operations();
			ob.num1 = 2;
			ob.num2 = 2;
			
			ob.number1 = 10.0;
			ob.number2 = 4.0;
			
			ob.calc(ob.num1, ob.num2);
			ob.calc(ob.number1, ob.number2);
	}

}
