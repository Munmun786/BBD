package fullprogram;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int ogNum= num;
		int rev=0;
		
		while(num !=0) {
			rev=rev*10 + num%10;
			num=num/10;
			
		}
		if(rev == ogNum) {
			System.out.println("palindrom number");
		}
		else {
			System.out.println("not a palindrom number");
		}
	}

}
