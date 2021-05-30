package com.vm.training.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(3);
		a.add(14);
		a.add(5);
		a.add(7);
		a.add(8);
		System.out.println(a.get(0));
		
		Collections.sort(a);
		System.out.println(a);
		
		Collections.reverse(a);
		System.out.println(a);
		System.out.println(a.get(a.size()-1));
		System.out.println(a.get(0));
		/*int o=0;
		int e=0;
		for(int i=0;i<a.size();i++)
		{
			int b=(int) a.get(i);
			
			if(b%2 != 0)
			{
			  o=o+b;
			}
			else
			{
				int c=(int) a.get(i);
				e=e+c;
			}
		}
		System.out.println(o);
		System.out.println(e);
		return false;*/
		Iterator itr=a.iterator();
		int e=0;
		int o=0;
				if(itr.hasNext())
				{
					int b=(int) itr.next();
					if(b%2==0)
					{
						e=e+b;
					}
				}
				else
				{
					int c=(int) itr.next();
				}
		
		

	}

}
