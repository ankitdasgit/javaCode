package arraysproblems;

public class BubbleSort {

	public static void main(String[] args) {
		
		//sort this array by bubble sort algorithm 
		
//		int [] a= {2,56,1,32,22,12};
//		int n=a.length;
//		//for(int i=0;i<n-1;i++) 
//		//one change for when your element are sort than
//		//for loop is stop 
//		for(int i=0;i<n-1-i;i++)
//		{
//			for(int j=0;j<n-1;j++) {
//				
//				if(a[j+1]<a[j]) {
//					int temp= a[j+1];
//					 a[j+1]= a[j];
//					 a[j]=temp;
//				}
//					
//			}
//		}
//		   // print element 
//		
////		for(int i=0;i<=n-1;i++) {
////			System.out.print(a[i]+" ");
////		}
//		
//		for(int item: a) {
//			System.out.print(item +"  ");
//		}
//		
//		System.out.println();
//		
      
		int [] a= {2,56,1,32,22,12};
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
