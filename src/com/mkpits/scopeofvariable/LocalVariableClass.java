package com.mkpits.scopeofvariable;

public class LocalVariableClass {
	static int a=110; //static variable
	
	int c = 30; // instances

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// local variable declared inside any method
		// we can not used local variable without initiallization
		// we can not access that value from outside the method
		
		
		int a=10; //local variable
	    System.out.println(a);
		System.out.println(LocalVariableClass.a);
		SecondClassStatic sc=new SecondClassStatic();
		System.out.println(sc.StaticVar);
		
		LocalVariableClass variableClass = new LocalVariableClass();
		System.out.println(variableClass.c);
		

		
	}
	
	void add()
	{
		int pinCode=656868;
		System.out.println(pinCode);
	}
	
	void sub()
	{
		int pinCode=440023;
		System.out.println(pinCode);
	}

}
