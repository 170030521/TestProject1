package com.vm.training.java.Test;

import java.util.Scanner;

public class WordCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int l=str.length();
		int c=0;
		int d=0;
		for(int i=0;i<l;i++)
		{
			d++;
			if(str.charAt(i)==' ')
			{
			  c++;	
			}
				
		}
		c=c+1;
		System.out.println("Word->"+c);
		System.out.println("Character->"+d);

	}

}
