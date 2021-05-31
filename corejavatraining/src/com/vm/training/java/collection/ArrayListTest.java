package com.vm.training.java.collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ArrayListTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList=new ArrayList();

		arrayList.add(new Integer(10));
		arrayList.add("hfhg");
		arrayList.add(10);
		arrayList.add("jhfjskjs");
		/*arrayList.add(2,"f");
		arrayList.remove(0);*/
		
		System.out.println(arrayList.contains("jshbfjsbf"));
		System.out.println(arrayList.get(0));
		Iterator itr =arrayList.iterator();
		
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		
			Map map=new HashMap();
			map.put(100, "geetha");
			System.out.println(map);
		
		


	}

}
