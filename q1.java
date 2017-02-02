/*
	In the name of God
	
	Seyed Ali Mirferdos
	AP : Java Homework Seri 1
	Winter 1395
	
	It will input a char which is Z , N , M
	and will print that char using * according to
	the number given
*/

import java.util.*;
class q1{
	public static void main(String[] h){
	
		Scanner x = new Scanner(System.in);
		char state = x.next().charAt(0);
		int n = x.nextInt();
		
		switch(state){
			case 'Z':
				for(int i = 0; i < n; i++)
					System.out.print("*");
				
				System.out.print("\n");
				
				for(int  i = n - 2; i > 0; i--){
					for(int j = 0; j < i; j++)
						System.out.print(" ");
						
					System.out.print("*\n");
				}
				
				for(int i = 0; i < n; i++)
					System.out.print("*");
			break;
			
			case 'N':
				for(int  i = 0; i < n; i++){
					System.out.print("*");
					
					for(int j = 0; j < i; j++)
						System.out.print(" ");
					if(i != 0)
						System.out.print("*");
					else
						System.out.print(" ");
					for(int j = 0; j < n - 2 - i; j++)
						System.out.print(" ");
					if(i != n - 1)
					System.out.print("*\n");
				}
			break;			
			
			case 'M':
				int k = 1;
				for(int i = 1; i < n ;i++)
					System.out.print(" ");
				System.out.print("*");
				for(int i = 0; i < n * 2 - 3;i++)
					System.out.print(" ");
				System.out.print("*\n");
				
				for(int  i = n - 2; i > 0 ; i--){
					
					for(int j = 0; j < i; j++)
						System.out.print(" ");
					
					System.out.print("*");
					
					for(int j = 0; j < 2 * k - 1; j++)
						System.out.print(" ");
		
					System.out.print("*");
					
					for(int j = 0; j < i * 2 - 1; j++)
						System.out.print(" ");
					
					System.out.print("*");
					
					for(int j = 0; j < 2 * k - 1; j++)
						System.out.print(" ");
					
					System.out.print("*\n");
					
					k++;
				}
				
				System.out.print("*");
				for(int i = 0; i < n * 2 - 3 ;i++)
					System.out.print(" ");
				System.out.print("*");
				for(int i = 0; i < n * 2 - 3;i++)
					System.out.print(" ");
				System.out.print("*");
			break;	
		}
	}
}

/*
Examples for n = 4: 

****
  *       
 *     
****

*   *
* * *
*  **
*   *

   *     *
  * *   * *
 *   * *   *
*     *     *

*/