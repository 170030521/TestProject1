package com.vm.training.java.concurrency;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConxurrentHashMapDemo {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<String, Integer> hm=new ConcurrentHashMap<String,Integer>();
		hm.put("geetha", 1);
		hm.put("geeth", 2);
		hm.put("geeta", 3);
		System.out.println("elemenst "+hm);
		hm.computeIfAbsent("hhhh", a->90);
		System.out.println(hm);
		System.out.println(hm.containsValue(5));
		for(Integer val:hm.values())
		{
			System.out.println(val);
			hm.computeIfAbsent("hhhhhhhh", a->910);
			
		}
		System.out.println(hm);
		
		

	}

}
