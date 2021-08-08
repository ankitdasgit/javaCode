package arraysproblems;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a[]= {45,43,23,11,2,-9,0};
        int n=a.length;
        
        for(int i=0;i<n-1;i++) {
        	
        	int minindx=i;
        	
        	for(int j=i;j<n;j++) {
        		
        		if(a[minindx]>a[j]) {
        			minindx=j;
        		}
        	}
        	
        	int temp=a[i];
        	a[i]=a[minindx];
        	a[minindx]=temp;
        
        }
        
        for(int e:a) {
        	System.out.print(e+" ");
        }

	}    

}
