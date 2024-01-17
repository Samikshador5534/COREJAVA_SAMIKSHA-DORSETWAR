package com.mkpits.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> colorList1 = new ArrayList<String>();
		
		if(colorList1.isEmpty()) {
			
		}
		colorList1.add("Red");
		colorList1.add("Blue");
		colorList1.add("White");
		colorList1.add("Pink");
		colorList1.add("yellow");

	   ArrayList<String> colorList2 = new ArrayList<String>();
	    colorList2.add("Red");
		colorList2.add("Black");
		colorList2.add("indigo");
		colorList2.add("Pink");
		colorList2.add("green");
		
		System.out.println("Lets Print Color List");
		for (String color : colorList1) {
			System.out.println(color);
		}
		
		System.out.println("Lets Print Color List 2");
		for (String color2 : colorList2) {
			System.out.println(color2);
		}
		
		System.out.println("\n colorList1 after addAll");
		
		
	}

}
