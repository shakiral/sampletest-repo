package com.programs;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random=new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(800));
			
		}
	}

}
