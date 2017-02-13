/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 3
	Winter 1395
	
	1- Finding the frequency of a number in an array
	2- Finding the most and least repeated word in an array using the first part
*/ 

import java.util.*;
class seri3_q2{
	static int  frequency  (int a[] , int x){
		int fr = 0;
		for(int i = 0; i < a.length; i++)
			if(a[i] == x)
				fr++;
		return fr;
	}
	static int[][] maxMin(int a[]){
		int maxIndex = 0, minIndex = 0 , fr = frequency(a , a[0]);
		int min = fr , max = fr;
		
		for(int i = 1; i < a.length; i++){
			fr = frequency(a , a[i]);
			if(fr < min){
				min = fr;
				minIndex = i;
			}
			if(fr > max){
				max = fr;
				maxIndex = i;
			}
		}
		
		int[][] result = new int[2][2];
		result[0][0] = min;
		result[0][1] = minIndex;
		result[1][0] = max;
		result[1][1] = maxIndex;
		
		return result;
	}
	public static void main(String[] h){
		Scanner input = new Scanner(System.in);
		int[] a = {3,4,3,5,6,3,8,3,9,3};
		int[][] result;
		result = maxMin(a);
		
		System.out.println("Min: " + a[result[0][1]] + " : " + result[0][0]);
		System.out.println("Max: " + a[result[1][1]] + " : " + result[1][0]);
	}
}