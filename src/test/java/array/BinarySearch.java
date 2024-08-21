package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,9};
		int key=5;
		int lower=0;
		int higher=a.length-1;
		
boolean flag=false;
while(lower<=higher) {
	int mid= (lower + higher)/2;
	
	if(a[mid]==key) {
		
		System.out.println("found "+ key);
		flag=true;
		break;
	}
	if( key > a[mid]) {
		lower=mid +1;
	}
	if ( key<a[mid]) {
		higher= mid-1;
	}
	
	
}
if(flag == false) {
	System.out.println("not found");
	
}
		
		
//		int b=Arrays.binarySearch(a, 2);
//		System.out.println(b);
//		
		
	}

}
