package fullprogram;

import java.util.Scanner;

public class ReveserString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a steing");
		String s = sc.next();
		String rev = "";
		int len= s.length();
		for(int i=len-1; i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		
		
	}

}
