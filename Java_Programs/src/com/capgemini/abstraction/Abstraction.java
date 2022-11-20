package com.capgemini.abstraction;

//abstract with class
abstract class A
{
 // abstract with method
 // it has no body
 abstract void method1();
  
 // concrete methods are still allowed in abstract classes
 void method2()
 {
     System.out.println("This is a method 2.");
 }
}

//concrete class B
class B extends A
{
 // class B must override m1() method
 // otherwise, compile-time exception will be thrown
 void method1() {
     System.out.println("B's implementation of method 1.");
 }
  
}

public class Abstraction {

	public static void main(String[] args) {
		
		B Ob = new B();
		Ob.method1();
		Ob.method2();
	}

}
