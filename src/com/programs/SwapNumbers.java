package com.programs;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10,y=20,temp = 0;
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("X value "+x);
		System.out.println("Y value "+y);
		
		//Without Third variable
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("X value "+x);
		System.out.println("Y value "+y);
	}

}
