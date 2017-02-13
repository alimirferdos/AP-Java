/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 3
	Winter 1395
	
	1- Reversing an array
	2- Checking if the given array is symmetric or not
*/ 

import java.util.*;
class seri3_q4{
	static float []reverse(float a[]){
		float[] res = new float[a.length];
		int j = 0;
		for(int i = a.length - 1; i >= 0;i-- , j++)
			res[j] = a[i];
		return res;
	}
	static boolean isSym(float[] a){
		float[] rev = reverse(a);
		for(int i = 0; i < a.length; i++)
			if(a[i] != rev[i])
				return false;
		return true;
	}
	public static void main(String[] h){
		float[] array = {1 , 2 , 1};
		
		System.out.println(isSym(array));
	}
}