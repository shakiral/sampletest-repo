package com.org.corejava;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateListOfArray {

	public static void main(String[] args) {
		
		String str="In Bangalore IT companies are more, who works in IT Bangalore";
		String[] arr=str.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String temp:arr)
		{
			Integer count= map.get(temp);
			if(count==null)
			{
				map.put(temp, 1);
			}
			else
			{
				map.put(temp,++count);
			}
		}
		Set<Entry<String,Integer>> setMap=map.entrySet();
		for (Entry<String,Integer> entry:setMap) {
			if(entry.getValue()>1)
			{
				System.out.println("Maximum frequencies:"+entry.getKey());
			}
		}
		
	}

}
