/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 5
	Winter 1395
	
	Polynomial class
*/

import java.util.*;

class Poly{
	int  n;
	double c[];
	
	// inputting
	void read(){
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		c = new double[n + 1];
		for(int i = 0; i < n + 1; i++){
			System.out.print("Enter coefficient of x ^ " + i + ": ");
			c[i] = input.nextDouble();
		}
	}
	
	// Showing
	void print(){
		for(int i = n; i > 0; i--){
			if(c[i] != 0)
				System.out.print(c[i] + "x ^ " + i + " + ");
		}
			
		System.out.println(c[0]);
	}
	
	// returning the value of the poly. in a given number
	double valueIn(double x){
		double result = 0;
		for(int i = 0; i < n + 1; i++)
			result += power(x , i) * c[i];
		
		return result;
	}
	
	// power
	protected double power(double x , int n){
		double result = 1;
		for(int i = 0; i < n; i++)
			result *= x;
		
		return result;
	}
	
	// adding the current poly to a given poly
	Poly add(Poly x){
		Poly fpoly = new Poly();
		fpoly.n = Math.max(x.n , n);
		fpoly.c = new double[fpoly.n + 1];
		
		if(x.n > n){
			int i;
			for(i = 0; i < n + 1; i++)
				fpoly.c[i] = x.c[i] + c[i];
			for(i = i; i < x.n + 1; i++)
				fpoly.c[i] = x.c[i];
		}
		else{
			int i;
			for(i = 0; i < x.n + 1; i++)
				fpoly.c[i] = x.c[i] + c[i];
			for(i = i; i < n + 1; i++)
				fpoly.c[i] = c[i];
		}
		return fpoly;
	}
	
	// multiplying the current poly with a given poly
	Poly multiply(Poly x){
		Poly fpoly = new Poly();
		fpoly.n = x.c.length + c.length ;
		fpoly.c = new double[fpoly.n + 1];
        for (int i = 0; i < c.length ; i++)
            for (int j = 0; j < x.c.length; j++) 
                fpoly.c[i + j] += c[i] * x.c[j];
            
		return fpoly;
	}
	
}
class seri5_q2{
	public static void main(String[] h){
		// Inputting two poly.
		Poly p1 = new Poly() , p2 = new Poly();
		p1.read();
		p2.read();
		p1.print();
		p2.print();
		
		// result of add and multiply
		Poly addpoly = p1.add(p2);
		System.out.println("\nAdding two polynomials to each other: ");
		addpoly.print();
		Poly mulpoly = p1.multiply(p2);
		System.out.println("\nMultiplying two polynomials by each other: ");
		mulpoly.print();
		
		System.out.println("\n\nCalculating the value from -10 to 10: ");
		// Calculating the value from -10 to 10 
		double max = mulpoly.valueIn(-10), min = max;
		int maxp = -10 , minp = -10;
		System.out.println("-10 : " + min);
		double v;
		
		for(int i = -9; i < 11; i++){
			v = mulpoly.valueIn(i);
			System.out.println(i + " : " + v);
			if(v > max){
				max = v;
				maxp = i;
			}
			if(v < min){
				min = v;
				minp = i;
			}
		}
		
		// Showing the max and min from the previous range
		System.out.println("max value was at " + maxp + " with the value : " + max);
		System.out.println("min value was at " + minp + " with the value : " + min);
	}
}
