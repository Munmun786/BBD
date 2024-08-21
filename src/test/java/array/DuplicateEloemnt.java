package array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DuplicateEloemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String arr[]= {"java","c","c+=","java","python"};
//	
//	boolean flage=false;
//	for(int i=0;i<arr.length;i++) {
//		
//		for(int j=i+1;j<arr.length;j++) {
//			
//			if(arr[i]==arr[j])
//				System.out.println("duplicate elembt is" + arr[i]);
//		        flage=true;
//		
//		}
//	}
//		
//	if (flage==false) {
//		System.out.println("not fount");
//	}
//		
	
	HashSet<String>lang = new HashSet();
	
	for(String l: arr) {
		if(lang.add(l)==false) {
			System.out.println("duplicate valu   " + l);
		}
		
	}
	
	
	
		
		
	}

}
