package arraysproblems;

import java.util.Scanner;

public class Matrixaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your dimention(row & coloum)");
		int row = sc.nextInt();
		int coloum =sc.nextInt();
		
		int a[][]= new int [row][coloum];
        int b[][]=new int [row][coloum];
        
        System.out.println("enter your first matrix a ");
        for(int i=0;i<row;i++) {
          for(int j=0;j<coloum;j++) {
        	  a[i][j]=sc.nextInt();
          }
        }
           
        System.out.println("enter your second matrix b ");
        for(int i=0;i<row;i++) {
            for(int j=0;j<coloum;j++) {
          	  b[i][j]=sc.nextInt();
            }
          }
        
        int c[][]=new int[row][coloum];
        
       
        
        for(int i=0;i<row;i++) {
            for(int j=0;j<coloum;j++) {
          	 c[i][j]=a[i][j]+b[i][j];
            }
          }
       
        System.out.println("result is :");
        
        for(int i=0;i<row;i++) {
          for(int j=0;j<coloum;j++) {
        	  System.out.print(c[i][j]+" ");
          }
          System.out.println();
        }
        
        
        
      
	}

}
