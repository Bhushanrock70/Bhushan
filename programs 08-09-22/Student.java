package com.bct.java8features.methodreferences;

import java.util.function.BiFunction;

interface MyInterface
{
	//A method -- abstract method
	public void display();
}

// --->make reference to the abstract method and instance method. 
//Method reference to an instance method of anobject - Object::instanceMethod




public class Student {
/*
 * Method references is the short hand notation of lambda expression to call a method.
 * str ->System.out.println(str);
 * System.out::println
 */
	
	public void myMethod()
	{
		System.out.println("Instance Method");
		System.out.println("------I have been referenced by the abstract---------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		
		//Method reference using the object of the class
		MyInterface ref=obj::myMethod;
		
		//calling the method of functional Interface
		ref.display();
		
		/*
		 * Method reference to static method of the class.
		 */
		
		//create an object to class addition
		BiFunction<Integer,MyInteferce,Integer>addtion :: add;
		int sum=Addition.apply(11,5);
		System.out.println("Addition of no is": + sum );
	}

}
