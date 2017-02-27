/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 6
	Winter 1395
	
	Matrix class with Get, Show, Add, Subtract, Multiply methods
*/ 

import java.util.*;
class matrix{
	int col , row;
	int [][] nums;
	
	matrix(){}
	
	matrix(int r , int c){
		row = r;
		col = c;
		nums = new int[r][c];
	}
	
	void read(){
		Scanner input = new Scanner(System.in);
		System.out.print("How many rows? ");
		row = input.nextInt();
		System.out.print("How many columns? ");
		col = input.nextInt();
		nums = new int[row][col];
		
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				nums[i][j] = input.nextInt();
	}
	
	void print(){
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++)
				System.out.print(nums[i][j] + " ");
		System.out.print("\n");
		}
	}
	
	matrix add(matrix a){
		if(row != a.row || col != a.col)
			return null;
			
		matrix res = new matrix(row,col);
			
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				res.nums[i][j] = nums[i][j] + a.nums[i][j];
		
		return res;
	}
	
	matrix subtract(matrix a){
		if(row != a.row || col != a.col)
			return null;
			
		matrix res = new matrix(row,col);
			
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				res.nums[i][j] = nums[i][j] - a.nums[i][j];
		
		return res;
	}
	
	matrix multiply(matrix a){
		if(col != a.row)
			return null;
		
		matrix res = new matrix(row,a.col);
			
		for(int i = 0; i < row; i++)
			for(int j = 0; j < a.col; j++)
				for(int k = 0; k < a.col; k++)
					res.nums[i][j] += nums[i][k] * a.nums[k][j];
		
		return res;
	}
}

class seri6_q2{
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