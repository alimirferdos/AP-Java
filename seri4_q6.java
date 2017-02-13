/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 4
	Winter 1395
	
	Matrices Get, Show, Add, Subtract, Multiply
*/ 

import java.util.*;
class seri4_q6{
	static int[][] getMatrix(int n , int m){
		int[][] a = new int[n][m];
		Scanner x = new Scanner(System.in);
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				a[i][j] = x.nextInt();
		
		return a;
	}
	static void showMatrix(int[][] a){
		int n = a.length , m = a[0].length;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++)
				System.out.print(a[i][j] + " ");
		System.out.print("\n");
		}
	}
	static int[][] addMatrix(int[][] a , int[][] b){
		int n = a.length , m = a[0].length;
		int[][] res = new int[n][m];
		
		if(n != b.length || m != b[0].length)
			return (int[][]) null;
			
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				res[i][j] = a[i][j] + b[i][j];
		
		return res;
	}
	static int[][] subtractMatrix(int[][] a , int[][] b){
		int n = a.length , m = a[0].length;
		int[][] res = new int[n][m];
		
		if(n != b.length || m != b[0].length)
			return (int[][]) null;
			
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				res[i][j] = a[i][j] - b[i][j];
		
		return res;
	}
	static int[][] multiplyMatrix(int[][] a , int[][] b){
		int n = a.length , m = a[0].length;
		int[][] res = new int[n][m];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				res[i][j] = 0;
		
		if(m != b.length || n != b[0].length)
			return (int[][]) null;
			
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				for(int k = 0; k < m; k++)
					res[i][j] += a[i][k] * b[k][j];
		
		return res;
	}
	public static void main(String[] h){
		// Getting two matrices
		int[][] a = getMatrix( 2 , 2);
		int[][] b = getMatrix( 2 , 2);
		
		// Showing two matrices
		showMatrix(a);
		System.out.print("\n");
		showMatrix(b);
		System.out.print("\n");
		
		// Adding two matrices
		showMatrix(addMatrix(a , b));
		System.out.print("\n");
		
		// Subtracting two matrices
		showMatrix(subtractMatrix(a , b));
		System.out.print("\n");
		
		// Multiplying two matrices
		showMatrix(multiplyMatrix(a , b));
		System.out.print("\n");
	}
}