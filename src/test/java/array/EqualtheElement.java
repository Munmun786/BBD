package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class EqualtheElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[]= {1,2,3,4,5,7};
		int a2[]= {1,2,3,3,45,6};
//		
//		boolean status=Arrays.equals(a1, a2);
//		
//		if (status == true) {
//			System.out.println("equal");
//		}
//		else {
//			System.out.println("not eual");
//		}
//		
		
		boolean status =true;
		
		if(a1.length == a2.length) {
			
			
			for(int i=0;i<=a1.length-1;i++) {
				if(a1[i]!=a2[i])
					status=false;
			}
		}else {
			status=false;
		}
		if (status=true) {
			
			System.out.println("equa");
		}else {
			System.out.println("not eual");
		}
		
		
	}

}
