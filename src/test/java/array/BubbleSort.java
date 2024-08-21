package array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {12,23,11,15,33,22};
		
		int n=a.length-1;
		
		System.out.println("array value "+ Arrays.toString(a));
		//accending order
		for(int i =0; i<n;i++) {
			
			for(int j=0;j<n;j++) {
			
				if(a[j]>a[j+1] ) {
					int temp= a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
				
				
				
			}
		}
		
		
		System.out.println("sorted array "+ Arrays.toString(a));
	
	//decending order
	
	
for(int i =0; i<n;i++) {
			
			for(int j=0;j<n;j++) {
			
				if(a[j]<a[j+1] ) {
					int temp= a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
				
				
				
			}
		}
	
	
	
	
	
	
	
	}

}
