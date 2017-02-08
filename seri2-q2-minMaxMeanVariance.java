/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 1
	Winter 1395
	
	
	It will input some numbers until 0 is given
	and will output max , min , mean , variance of them
*/

import java.util.*;
class q2{
	public static void main(String[] h){
		Scanner x = new Scanner(System.in);
		int n;
		n = x.nextInt();
		int max = n, min = n, no = 1 , sum = n , sqrsum = n * n;
		
		while(1 == 1 && n != 0){
			n = x.nextInt();
			if(n != 0){
				if(max < n)
					max = n;
				if(min > n)
					min = n;
				
				no++;
				sum += n;
				sqrsum += n * n;
			}
			else
				break;
		}

		double mean = sum / no;
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Mean: " + mean);
		System.out.println("Variance: " + (sqrsum- mean));
	}
}
