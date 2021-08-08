package arraysproblems;

import java.util.Scanner;

public class CountSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {45,22,56,77,88,90};
		int res=0;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(n>a[i]) {
				res++;
			}
		}
		System.out.println(res);

	}

}
