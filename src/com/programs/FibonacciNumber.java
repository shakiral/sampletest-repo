package com.programs;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int previousNum=0,nextNum=1,maxNum=10;
		
		for (int i = 0; i < maxNum; i++) {
			
			System.out.println(""+previousNum);
			int sum=previousNum+nextNum;
			previousNum=nextNum;
			nextNum=sum;
			
		}
	}

}
