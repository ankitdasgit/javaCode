package arraysproblems;

import java.util.Scanner;

public class AverageStudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);

		System.out.println("enter your total student ");
		int n= sc.nextInt();
		int marks[]=new int [n];
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		int average = 0;
		for(int j=0;j<n;j++) {
			average+=marks[j];
		}
		
		average=average/n;
		System.out.println("average is :");
		System.out.print(average);
		}
	}


