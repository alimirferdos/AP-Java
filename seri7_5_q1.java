/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 7
	Winter 1395
	
	Polynomial class
*/

import java.util.Scanner;

class Complex{
	private double x , y;
		
	static number = 0;

	//	Setters
	public setx(double x){
		this.x = x;
	}
	public sety(double y){
		this.y = y;
	}
	
	//	Getters
	public double getx(){
		return x;
	}
	public double gety(){
		return y;
	}
	
	finalize(){
		number--;
	}
	
	Complex(){
		number++;
	}
	
	// inputting
	public void read(){
		Scanner input = new Scanner(System.in);
		x = input.nextDouble();
		System.out.print(" + i");
		y = input.nextDouble();
	}
	
	// Showing
	public void print(){
		System.out.print(x);
		if(y < 0){
			System.out.print(" - ");
			y *= -1;
		}
		else
			System.out.print(" + ");
		
		System.out.println(y + "i");
	}
	
	// Addition
	Complex add(Complex c){
		Complex res = new Complex();
		res.x = x + c.x;
		res.y = y + c.y;
		return res;
	}
	
	// Extraction
	Complex extract(Complex c){
		Complex res = new Complex();
		res.x = x - c.x;
		res.y = y - c.y;
		return res;
	}
	
	// Multiplication
	Complex multiply(Complex c){
		Complex res = new Complex();
		res.x = x * c.x + y * c.y;
		res.y = x * c.y - c.x * y;
		return res;
	}
	
	// Power
	Complex power(int a){
		Complex res = new Complex();
		res.x = 1;
		res.y = 1;
		for(int i = 0; i < a; i++)
			res = res.multiply(this);
		return res;
	}

	// Conjugate
	Complex conj(){
		Complex res = new Complex();
		res.y *= -1;
		return res;
	}

	// Distance between the current number and the given one
	double distance2(Complex c){
		double res = (x - c.x) * (x - c.x) + (y - c.y) * (y - c.y);
		return res;
	}
	
	// Multiplying by a number
	Complex multiplyNum(double a){
		Complex res = new Complex();
		res.x = x * a;
		res.y = y * a;
		return res;
	}

}
class seri7_5_q1{
	public static void main(String[] h){
		Complex[] complexes = new Complex[10];
		
		// Initializing the array randomly
		for(int i = 0; i < complexes.length; i++){
			complexes[i] = new Complex();
			
			complexes[i].x = (int)(Math.random() * 100 - 50);
			complexes[i].y = (int)(Math.random() * 100 - 50);
			
			// Printing the generated date
			complexes[i].print();
		}
		
		// Finding the numbers with the most and the least distance 
		double max = complexes[0].distance2(complexes[1]), min = max;
		int cmax1 = 0, cmax2 = 1, cmin1 = 0, cmin2 = 1;
		
		for(int i = 1; i < complexes.length; i++){
			for(int j = i + 1; j < complexes.length; j++){
				double d = complexes[i].distance2(complexes[j]);
				
				if(max < d){
					max = d;
					cmax1 = i;
					cmax2 = j;
				}
				if(min > d){
					min = d;
					cmin1 = i;
					cmin2 = j;
				}
			}
		}
		
		System.out.println("\nmax distance was " + Math.sqrt(max) + " which was produced by the numbers : ");
		complexes[cmax1].print();
		complexes[cmax2].print();
		System.out.println("\nmin distance was " + Math.sqrt(min) + " which was produced by the numbers : ");
		complexes[cmin1].print();
		complexes[cmin2].print();
		
		
		// Checking if conj(z) * z = |z|^2 is true
		boolean is = true;
		for(int i = 0; i < complexes.length; i++){
			Complex z = complexes[i].conj().multiply(complexes[i]);
			if(z.x != complexes[i].x * complexes[i].x && z.y == 0){
				is = false;
				break;
			}
		}
		if(is)
			System.out.println("\nconj(z) * z = |z|^2 is true");
		else
			System.out.println("\nconj(z) * z = |z|^2 is false");
			
		
		// Finding the answers for z^12 - 6 * z^6 + 5 * z - 12 = 0
		Complex z = new Complex();
		System.out.println("\nThe answers for z^12 - 6 * z^6 + 5 * z - 12 = 0:");
		for(double i = -100; i < 1000; i+= 0.1){
			for(double j = -100; j < 1000; j+= 0.1){
				z.x = i;
				z.y = j;
				z = z.power(12).extract(z.power(6).multiplyNum(6)).add(z.multiplyNum(6));
				if((int)(z.x - 12) == 0 && (int)z.y == 0)
					z.print();
			}
		}
	}
}
