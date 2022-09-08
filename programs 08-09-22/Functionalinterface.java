package com.bct.java8features.functional.interfaces;

import java.util.function.IntBinaryOperator;

//default interfaces
interface Myinterface
{
	default void newMethod()
	{
		System.out.println("Newly added default method.");
	}
	void myMethod(String message);
	//abstract method
	public void existingMethod(String str);
}

//Inheritance concept
class Example implements Myinterface
{
	@Override
	public void myMethod(String message)
	{
		System.out.println("Message is : " + message);
	}

	@Override
	public void existingMethod(String str) {
		// TODO Auto-generated method stub
		
	}
}


// Creating our own functional interface
interface MyFunctionalInterface
{
	//single abstract method.
	public int addMethod(int a,int b);
}
public class Functionalinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lambda Operation
		MyFunctionalInterface sum=(a,b) -> a+b;
		System.out.println("Result=" + sum.addMethod(12,100));
		
		//predefined function interface
		//lambda expression
		System.out.println("-printed by the predefined interface-----");
		IntBinaryOperator add=(a,b) -> a+b;
		System.out.println("Result = " + add.applyAsInt(12,100));
	
		//creating an object to the class Example
		Example instan=new Example();
		//calling the default method of interface
		instan.newMethod();
		//calling the abstract method of interface
		instan.existingMethod("Java 8 is easy to learn");
	}

}
