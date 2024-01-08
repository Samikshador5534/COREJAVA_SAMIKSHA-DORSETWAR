package com.mkpits.array;

public class Multiplication_Table {

	 public static void main(String[] args) {
	        int n = 11; // 
	        
	        // Create a 2D array to store the multiplication table
	        int[][] table = new int[n][n];
	        
	        // for  multiplication table
	        for (int i = 1; i < n; i++) {
	            for (int j = 1; j < n; j++) {
	                table[i][j] = (i  * j );
	            }
	        }
	        
	        // Display the multiplication table
	        for (int i = 1; i < n; i++) {
	            for (int j = 1; j < n; j++) {
	                System.out.printf("%2d x %2d = %2d   ", i , j , table[i][j]);
	            }
	            System.out.println(); 
	        }
	    }
}
