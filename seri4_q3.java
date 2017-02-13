/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 4
	Winter 1395
	
	Sorting Words
*/ 

import java.util.*;
class seri4_q3{
	public static void BubbleSort(String[] s ){
		String temp;
		for(int i = 0; i < s.length; i++){  
			for(int j = 0;  j < s.length - 1; j++){
				   if (s[j].compareTo(s[j+1]) > 0){
						   temp = s[j]; 
						   s[j] = s[ j+1 ];
						   s[j+1] = temp;
					}
			}
		}
	}
	public static void main(String[] h){
		Scanner x = new Scanner(System.in);
		String[] words = new String[5];
		
		for(int i = 0; i < 5; i++)
			words[i] = x.next();
		
		BubbleSort(words);
		
		System.out.println("##########");
		
		for(int i = 0; i < 5; i++)
			System.out.println(words[i]);
	}
}