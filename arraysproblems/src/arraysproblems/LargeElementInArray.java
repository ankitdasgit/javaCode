package arraysproblems;

public class LargeElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a= {45,23,11,1,99,9};
		int n=a.length;
		int res=0;
            for(int i=0;i<n;i++) {
            	if(a[i]>res) {
            		res =a[i];
            	}
            	
            }
            System.out.println(res);
	}

}
