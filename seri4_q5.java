/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 4
	Winter 1395
	
	Pluralization of some specified names and pronouns of a given string
*/ 

import java.util.*;
class seri4_q5{
	public static void main(String[] h){
		String[] names = {"apple" , "desk" , "word" , "night", "kitchen" , "part"};
		String[] sub = {"he" ,"she" , "it"};
		String[] obj = {"him" ,"her" , "it"};
		String[] pos = {"his" ,"her" , "hers" , "its"};
		String[] ref = {"himself" ,"herself" , "itself"};
		
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
				words[wordCount] = s.substring(wordSindex , i);
				wordCount++;
			}
		}
		
		// Correcting the names
		for(int i = 0; i < wordCount; i++)
			for(int j = 0; j < names.length; j++)
				if(words[i].compareToIgnoreCase(names[j]) == 0)
					words[i] += "s";
		
		// Correcting the pronouns
		for(int i = 0; i < wordCount; i++){
			for(int j = 0; j < sub.length; j++)
				if(words[i].compareToIgnoreCase(sub[j]) == 0)
					words[i] = "they";
			
			for(int j = 0; j < obj.length; j++)
				if(words[i].compareToIgnoreCase(obj[j]) == 0)
					words[i] = "them";
			
			for(int j = 0; j < pos.length; j++)
				if(words[i].compareToIgnoreCase(pos[j]) == 0)
					words[i] = "theirs";
			
			for(int j = 0; j < ref.length; j++)
				if(words[i].compareToIgnoreCase(ref[j]) == 0)
					words[i] = "themselves";
			
			
			if(words[i].compareToIgnoreCase("I") == 0)
				words[i] = "we";
				
			if(words[i].compareToIgnoreCase("me") == 0)
				words[i] = "us";
			
			if(words[i].compareToIgnoreCase("my") == 0)
				words[i] = "our";
				
			if(words[i].compareToIgnoreCase("mine") == 0)
				words[i] = "ours";
				
			if(words[i].compareToIgnoreCase("myself") == 0)
				words[i] = "ourselves";
			
			if(words[i].compareToIgnoreCase("am") == 0)
				words[i] = "are";
			
			if(words[i].compareToIgnoreCase("is") == 0)
				words[i] = "are";
		}
		
		String newsen = "";
		for(int i = 0; i < wordCount; i++)
			newsen += words[i] + " ";

		// Printing the result
		System.out.println(newsen);
	}
}