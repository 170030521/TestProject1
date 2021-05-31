package com.vm.training.java.strings;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String word=sc.nextLine();
		int c=0;
		String[] words=str.split(" ");
		int l=words.length;
		for(int i=0;i<l;i++)
		{
			if(words[i].equals(word))
			{
				c++;
				
			}
		}
		System.out.println(c);
		

		

	}

}
