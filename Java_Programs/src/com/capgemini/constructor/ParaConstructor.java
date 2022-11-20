package com.capgemini.constructor;

 class A{
	//Data members of the class	
	int id;
	String name;
	/**
	 * @param id
	 * @param name
	 */
	public A(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class ParaConstructor {

	public static void main(String[] args) {
		
		A Ob = new A(13, "Rushikesh");
		System.out.println("My Name is : "+ Ob.name +" and Roll No. is : "+ Ob.id);

	}

}
