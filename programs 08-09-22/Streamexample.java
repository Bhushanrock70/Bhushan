package com.bct.java8features.streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class Streamexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<String>();
		
		//add the elements to the list
		names.add("Sachin");
		names.add("Bhushan");
		names.add("Wipro");
		names.add("Technology");
		names.add("Banglore");
		
		//I would like to count the number of elements present in the list.
		
		int count=0;
		for(String ele : names)
		{
			if(ele.length() <6)
				count++;
		}
		System.out.println("Where are: " + count + "Strings with length less than 6");
		
		//Lets apply stream now! - using lambda Expression.
		
		int number=(int) names.stream().filter(ele -> ele.length()<6).count();
		System.out.println("There are: "+ number + "String with length less than 6");
		
	}

}
