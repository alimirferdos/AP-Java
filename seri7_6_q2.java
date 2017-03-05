/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 7
	Winter 1395
	
	Matrix class with Get, Show, Add, Subtract, Multiply methods
*/ 

import java.util.*;
class matrix{
	private int col , row;
	private int [][] nums;
	static number = 0;

	//	Setters
	public setcol(int c){
		col = c;
	}
	public setrow(int r){
		row = r;
	}
	public setnums(int[][] n){
		nums = n;
	}
	
	//	Getters
	public int getcol(){
		return col;
	}
	public int getrow(){
		return row;
	}
	public int[][] getnums(){
		return nums;
	}

	
	finalize(){
		number--;
	}
	
	matrix(){
		number++;
	}
	
	matrix(int r , int c){
		setrow(r);
		setcol(c);
		int[][] n = new int[r][c];
		setnums(n);
		number++;
	}
	
	void read(){
		Scanner input = new Scanner(System.in);
		System.out.print("How many rows? ");
		setrow(input.nextInt());
		System.out.print("How many columns? ");
		setcol(input.nextInt());
		int[][] n = new int[row][col];
		
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				n[i][j] = input.nextInt();
		setnums(n);
	}
	
	void print(){
		int[][] n = getnums();
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++)
				System.out.print(n[i][j] + " ");
		System.out.print("\n");
		}
	}
	
	matrix add(matrix a){
		if(getrow() != a.getrow() || getcol() != a.getcol())
			return null;
			
		matrix res = new matrix(row,col);
			
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				res.nums[i][j] = nums[i][j] + a.nums[i][j];
		
		return res;
	}
	
	matrix subtract(matrix a){
		if(getrow() != a.getrow() || getcol() != a.getcol())
			return null;
			
		matrix res = new matrix(row,col);
			
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				res.nums[i][j] = nums[i][j] - a.nums[i][j];
		
		return res;
	}
	
	matrix multiply(matrix a){
		if(getcol() != a.getrow())
			return null;
		
		matrix res = new matrix(row,a.col);
			
		for(int i = 0; i < row; i++)
			for(int j = 0; j < a.getcol(); j++)
				for(int k = 0; k < a.getcol(); k++)
					res.nums[i][j] += nums[i][k] * a.nums[k][j];
		
		return res;
	}
}

class seri7_6_q2{
	public static void main(String[] h){
		// Getting two matrices
		matrix a = new matrix() , b = new matrix();
		a.read();
		b.read();
		
		// Showing two matrices
		a.print();
		System.out.print("\n");
		b.print();
		System.out.print("\n");
		
		matrix test;
		// Adding two matrices
		test = a.add(b);
		if(test != null)
			test.print();
		else
			System.out.println("The two matrices you entered cannot be added to each other.");
		System.out.print("\n");
		
		// Subtracting two matrices
		test = a.subtract(b);
		if(test != null)
			test.print();
		else
			System.out.println("The two matrices you entered cannot be subtracted from each other.");
		System.out.print("\n");
		
		// Multiplying two matrices
		test = a.multiply(b);
		if(test != null)
			test.print();
		else
			System.out.println("The two matrices you entered cannot be multiplied by each other.");
		System.out.print("\n");
	}
}