package array;

import java.util.Arrays;
import java.util.Collections;

public class SortBuildINMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a[]= {13,35,32,3,5,34};
//System.out.println("array "+ Arrays.toString(a));
  
//parallel sort
//   Arrays.parallelSort(a);
//   
//   System.out.println("array sortd"+ Arrays.toString(a));
//

//acending sort

//Arrays.sort(a);
//System.out.println("array sortd"+ Arrays.toString(a));
//
//	

//decending
		Integer a[]= {13,35,32,3,5,34};
		System.out.println("array "+ Arrays.toString(a));
Arrays.sort(a,Collections.reverseOrder());
System.out.println("array "+ Arrays.toString(a));
	
	}

}
