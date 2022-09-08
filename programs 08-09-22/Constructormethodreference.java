package com.bct.java8features.methodreferences;

@FunctionalInterface
interface ConstructorInterface
{
	Hello display(String say);
	
}
class Hello
{
	Hello(String say)
	{
		System.out.println("Good morning guys" + say);
	}
}
public class Constructormethodreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorInterface ref=Hello::new;
		ref.display("How are you doing...");
	}

}
