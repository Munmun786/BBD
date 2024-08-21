package fullprogram;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		String orgS= s;
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev= rev+s.charAt(i);
		}
		
		if (rev.equals(orgS)) {
			System.out.println("palindrom String");
		}else {
			System.out.println("not Palindrom String");
		}
	}

}
