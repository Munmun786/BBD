package string;

import java.util.Scanner;

public class EvenAndOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num =sc.nextInt();
		int even_count=0;
		int odd_count=0;
		
		while(num >0) {
			int rem = num%10;
			if (rem%2 ==0 ) {
				even_count++;
			} else {
               odd_count++;
			}
			num=num/10;
		}
		System.out.println("numbe" + even_count + "  "+ odd_count);
	}

}
