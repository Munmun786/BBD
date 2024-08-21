package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the name");
	 Scanner sc = new Scanner(System.in);
	 
	 String s = sc.next();
//	 String revString = "";
//	 char a[]= s.toCharArray();
//	 
//	 for(int i = a.length-1; i >=0; i--) {
//		 
//		revString = revString+a[i];
//		 
//	 }
//	 
	 
	 StringBuffer sr= new StringBuffer(s);
	 System.out.println(sr.reverse());
		
	}

}
