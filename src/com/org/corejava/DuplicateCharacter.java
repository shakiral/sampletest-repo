package com.org.corejava;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "quality tests";
		  int count = 0;
		  char[] charArray = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (charArray[i] == charArray[j]) {
		     System.out.println(charArray[j]);
		     count++;
		     break;
		    }
		   }
		  }
	}

}
