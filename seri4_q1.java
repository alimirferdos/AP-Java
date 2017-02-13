/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 4
	Winter 1395
	
	1- Counting vowels in a string 
	2- Finding the most an the least repeated char in the string
*/ 

import java.util.*;
class seri4_q1{
	static int vowels(String s){
		int count = 0;
		for(int i = 0; i < s.length();i++){
			char c = s.charAt(i);
			if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'o' || c == 'O' || c == 'i' || c == 'I' || c == 'u' || c == 'U')
				count++;
		}
		return count;
	}
	static int  frequency(String s , char x){
		int fr = 0;
		for(int i = 0; i < s.length(); i++)
			if(s.charAt(i) == x)
				fr++;
		return fr;
	}
	public static void main(String[] h){
		Scanner x = new Scanner(System.in);
		String s = x.nextLine();
		
		int maxIndex = 0, minIndex = 0 , fr = frequency(s , s.charAt(0));
		int min = fr , max = fr;
		
		for(int i = 1; i < s.length(); i++){
			fr = frequency(s , s.charAt(i));
			if(fr < min){
				min = fr;
				minIndex = i;
			}
			if(fr > max){
				max = fr;
				maxIndex = i;
			}
		}
		
		System.out.println("Vowels: " + vowels(s));
		System.out.println("Min: " + s.charAt(minIndex) + " : " + min);
		System.out.println("Max: " + s.charAt(maxIndex) + " : " + max);
	}
}