package com.org.corejava;

public class PatternTest {

	public static void main(String[] args) {
		 int i, j; 
		int n=4;
	        // outer loop to handle number of rows 
	        //  n in this case 
	        for(i=0; i<n; i++) 
	        { 
	  
	            //  inner loop to handle number of columns 
	            //  values changing acc. to outer loop     
	            for(j=0; j<=i; j++) 
	            { 
	                // printing stars 
	                System.out.print("* "); 
	            } 
	  
	            // ending line after each row 
	            System.out.println(); 
	}

}
}
