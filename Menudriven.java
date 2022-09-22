
import java.util.Scanner;


public class Menudriven {
	public static void main(String[] args) {
		int ch;
		int[][] a=new int [2][2]; 
		int[][] b=new int [2][2];
		int[][] c=new int [2][2];
		
		System.out.println("first num");
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=s.nextInt();	}	
		}
		System.out.println("second num");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j]=s.nextInt();	}
		}
		
		System.out.println("1  addition");
		System.out.println("2   multiplication");
		System.out.println("3   transpose");
		ch=s.nextInt();
		switch (ch) {
		case 1:
			
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < 1; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]);
				}
				
			}
			
			break;
		case 2:
		       for (int i = 0; i < 1; i++) {
		    	   for (int j = 0; j < 1; j++) {
		    		   c[i][j]=0;
		    		   for (int k = 0; k < 1; k++) {
		    			c[i][j]=c[i][j]+(a[i][j]*b[i][j]);
		    			System.out.println(c[i][j]);
						
					}
					
				}
				
			}     
		 
		case 3:
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
				System.out.print(a[j][i]);	
				}	
				System.out.println();
			}
			break;
			
			

		default:
			System.out.println("in valid");
			break;
		}
	}

}


