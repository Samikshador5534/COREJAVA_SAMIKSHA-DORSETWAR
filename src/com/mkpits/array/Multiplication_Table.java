package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication_Table {

	 public static void main(String[] args) throws NumberFormatException, IOException {
	        int n = 50; // 
	      //  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	      //  System.out.print("enter N value : ");
	      //  int n = Integer.parseInt(input.readLine());
	        // Create a 2D array to store the multiplication table
	        int[][] table = new int[11][n];
	        
	        // for  multiplication table
	        for (int i = 1; i < 11; i++) {
	            for (int j = 1; j < n; j++) {
	                table[i][j] = (i  * j );
	            }
	        }
	        
	        // Display the multiplication table
	        for (int i = 1; i < n; i++) {
	            for (int j = 1; j < n; j++) {
	               // System.out.printf("%2d x %2d = %2d   |", i , j , table[i][j]);
	            	System.out.printf("  %2d  ",table[i][j]);
	            }
	            System.out.println(); 
	        }
	    }
}
