package arraysproblems;
import java.util.Scanner;
public class bubblesortuserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");
		
		//reading the number of elements from the that we want to enter  
		int nn=sc.nextInt();  
		
		//creates an array in the memory of length nn
		int[] a = new int[nn];  
		
		System.out.println("Enter the elements of the array: ");  
	
		for(int i=0; i<nn; i++)  
		{  
		//reading array elements from the user   
		a[i]=sc.nextInt();  
		}  
		  
		  
		  
		  
		        int n=a.length;
		         
		        for(int i=0;i<n-1;i++) {
		            boolean sort= true;
		            for(int j=0;j<n-1-i;j++) {
		                if(a[j]>a[j+1]) {
		                int  temp= a[j];
		                a[j]=a[j+1];
		                a[j+1]=temp;
		                
		                sort= false;
		                }
		            }
		            if(sort)break;  
		        }
		        for(int item:a) {
		            System.out.print(item+" ");
		        
		        }
		  
		  
		    }
		}


