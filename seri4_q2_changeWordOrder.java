/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 4
	Winter 1395
	
	Changing the word's char order randomly
*/ 

import java.util.*;
class seri4_q2_changeWordOrder{
	public static void main(String[] h){
		Scanner x = new Scanner(System.in);
		String s = x.next();
		char[] sc = s.toCharArray();
		Random rand = new Random();
		int n;
		
		for(int i = 0; i < sc.length / 2; i++){
			n = rand.nextInt(sc.length / 2) + sc.length / 2;
			char temp = sc[i];
			sc[i] = sc[n];
			sc[n] = temp;
		}
		
		System.out.println(sc);
	}
}