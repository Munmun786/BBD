package array;

import java.util.Iterator;

public class EvenAndOddNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,5,6,8};
		System.out.println("even number");
		for(int i =0; i<=a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			
			//for(int value:a){
//			if(value%2==0)
//			System.out.println(value);
		}
		System.out.println("odd number");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		
	}

}
