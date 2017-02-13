/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 4
	Winter 1395
	
	Getting n points' x , y , color correspondingly 
	Outputting the point with the max and min distance from (0,0)
*/ 

import java.util.*;
class point{
	double x , y , r;
	int color;
}
class seri4_q8{
	public static void main(String[] h){
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		point[] p = new point[n];
		
		for(int i = 0; i < n; i++){
			p[i] = new point();
			
			p[i].x = x.nextDouble();
			p[i].y = x.nextDouble();
			p[i].color = x.nextInt();
			p[i].r = p[i].x*p[i].x + p[i].y*p[i].y;
		}
		
		double max = 0 , min = 0;
		int maxpos = 0 , minpos = 0;
		for(int i = 0; i < n; i++){
			if(p[i].r > max){
				max = p[i].r;
				maxpos = i;
			}
			if(p[i].r < min){
				min = p[i].r;
				minpos = i;
			}
		}
		
		// Printing the result
		System.out.println("Max: " + p[maxpos].color);
		System.out.println("Min: " + p[minpos].color);
	}
}