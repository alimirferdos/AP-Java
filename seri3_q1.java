/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 3
	Winter 1395
	
	Inputting a number 
	determines whether it is symmetric or not: 252 is
*/

import java.util.*;
class seri3_q1{
	static boolean isSym(int n){
		int nInverse = 0 , tempn = n;
		while(tempn > 0){
			nInverse += tempn % 10;
			nInverse *= 10;
			tempn /= 10;			
		}
		nInverse /= 10;
		if(nInverse == n)
			return true;
		else
			return false;
	}
	public static void main(String[] h){
		Scanner input = new Scanner(System.in);
		System.out.println(isSym(input.nextInt()));
	}
}