package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

	List<String> list =  Arrays.asList("Nayan","Rohan","Pranav","Mayur","Girish");	
		
		//System.out.println(list);
	
		for(String s:list){
			System.out.println(s);
		}
		
		
	//added a new arraylist	
	ArrayList arrayList = new ArrayList<>();
	arrayList.add(10);
	arrayList.add(20);
	arrayList.add(30);

		
	}

}
