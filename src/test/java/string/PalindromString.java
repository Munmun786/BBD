package string;

import java.util.Iterator;
import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String s = sc.next();
		String orgS = s;
		
		String rev = "";
		
		for(int i = s.length()-1; i>=0;i--) {
			
			rev= rev+s.charAt(i);
			
		}
		
		if (orgS.equals(rev)) {
		System.out.println("palindom");
		} else {

			System.out.println("not palindrom");
		}
		
		System.out.println(rev);
	}

}
