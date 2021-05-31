package com.vm.training.java.strings;

public class StringObjectCreation {
	public static void main(String[] args)
	{
		String s1=new String("valuemomentum");
		String s2="valuemomentum";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.concat("bdhhd"));
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(12));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.intern());
		System.out.println(s1.intern()==s2.intern());
		String s3="A";
		String s4="a";
		System.out.println(s3.compareTo(s4));
		String s5="    hhhh   hdfv   ";
		s5=s5.replace(" ","");
		System.out.println(s5);
		
		}

}
