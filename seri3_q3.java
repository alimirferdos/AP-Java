/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 3
	Winter 1395
	
	1- Inserting 
	2- Finding the most and least repeated word in an array using the first part
*/ 

import java.util.*;
class seri3_q3{
	public static int[] A;
	static void  insert (int  a[] , int x, int n){
		int start = 0 , end = n , prend = n;
		A = new int[a.length + 1];
		while(1 == 1){
			if(start - end >= 0){
				int i;
				if(prend == end){
					for(i = 0; i < n; i++)
						A[i] = a[i];
					A[i] = x;
					i++;
					for(int j = i - 1; j < n; j++ , i++)
						A[i] = a[j];
				}else{
					for(i = 0; i < start; i++)
						A[i] = a[i];
					A[i] = x;
					i++;
					for(int j = i - 1; j < n; j++ , i++)
						A[i] = a[j];
				}
						
				break;
			}
			
			if(x >= a[(end - start)/2]){
				start = (end - start)/2;			
				continue;
			}
			if(x <= a[(end - start)/2]){
				prend = end;
				end = (end - start)/2;
			}
		}
	}
	public static void main(String[] h){
		int[] a = {5 , 3 , 4 , 2 , 1};
		A = new int[1];
		for(int i = 0; i < a.length; i++){
			insert(A , a[i] , i);
		}
		
		for(int i = 0; i < A.length; i++)
			System.out.println(A[i]);
	}
}