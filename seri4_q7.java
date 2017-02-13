/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 4
	Winter 1395
	
	Finding the frequency of each word 
	and the most and the least repeated word
*/ 

import java.util.*;
class seri4_q7{
	static int  frequency (String words[] , String x , int count){
		int fr = 0;
		for(int i = 0; i < count; i++)
			if(words[i].compareTo(x) == 0)
				fr++;
		return fr;
	}
	public static void main(String[] h){
		Scanner x = new Scanner(System.in);
		String s = x.nextLine();
		s += " ";
		char[] sc = s.toCharArray();
		String[] words = new String[sc.length / 2];
		int wordCount = 0;
		
		//Splitting the words
		for(int i = 0; i < sc.length; i++)
			if(sc[i] < 'A' || sc[i] > 'z')
				sc[i] = ' ';
		
		boolean wstart = false;
		int wordSindex = 0;
		for(int i = 0; i < sc.length; i++){
			if(sc[i] != ' ' && wstart == false){
				wstart = true;
				wordSindex = i;
				continue;
			}
			if(sc[i] == ' ' && wstart == true){
				wstart = false;
				words[wordCount] = s.substring(wordSindex , i + 1);
				wordCount++;
			}
		}
		
		int maxIndex = 0, minIndex = 0 , fr = frequency(words , words[0] , wordCount);
		int min = fr , max = fr;
		int[] frequency = new int[wordCount];
		frequency[0] = fr;
		
		for(int i = 1; i < wordCount; i++){
			fr = frequency(words , words[i] , wordCount);
			frequency[i] = fr;
			
			if(fr < min){
				min = fr;
				minIndex = i;
			}
			if(fr > max){
				max = fr;
				maxIndex = i;
			}
		}
		
		// Printing the result
		for(int i = 1; i < wordCount; i++)
			System.out.println(words[i] + " : " + frequency[i]);
		
		System.out.println("Max: " + words[maxIndex] + " : " + max);
		System.out.println("Min: " + words[minIndex] + " : " + min);
	}
}