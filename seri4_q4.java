/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 4
	Winter 1395
	
	Changing the words' order in a given sentence
*/ 

import java.util.*;
class seri4_q4{
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
		
		// Making the new sentence
		String newsen = "";
		Random rand = new Random();
		int n , remainwords = wordCount;
		
		for(int i = 0; i < wordCount / 2; i++){
			n = rand.nextInt(wordCount / 2) + wordCount / 2;
			
			String temp = words[i];
			words[i] = words[n];
			words[n] = temp;
		}
		
		for(int i = 0; i < wordCount; i++){
			newsen += words[i];
		}
		
		// Printing the result
		System.out.println(newsen);
	}
}