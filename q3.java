/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 1
	Winter 1395
	
	It will output the 3-digit numbers
	which a^2 = b^2 + c^2 holds for their digits
	and will output the number of them as well
*/

import java.util.*;
class q3{
	public static void main(String[] h){
		int no = 0;
		for(int i = 100; i < 1000; i++){
			int d1 = i % 10 , d2 = (i / 10) % 10 , d3 = i / 100;
			if(d1 * d1 == d2 * d2 + d3 * d3 || d2 * d2 == d1 * d1 + d3 * d3 || d3 * d3 == d2 * d2 + d1 * d1){
				System.out.println(i);
				no++;
			}
		}
		System.out.println("There were " + no + " numbers.");
	}
}
