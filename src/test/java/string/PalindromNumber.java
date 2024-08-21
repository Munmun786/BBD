package string;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int orgNum= num;
		int rev = 0 ;
		
	while(num!=0) {
		rev= rev*10 + num%10;
		num=num/10;
	}
		
	if(orgNum == rev) {
		System.out.println("palindrom");
	}else {
		System.out.println("not palindrom");
	}

	
	System.out.println(rev);
}
}
