package string;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("number");
		int num = sc.nextInt();
		int count=0;
		
		if (num>1) {
			for(int i= 1;i<=num;i++) {
				
				if(num%i==0)
					count++;
				
			}
			if (count == 2) {
				System.out.println("prime");
			} else {
System.out.println("not prime");
			}
		} else {
   System.out.println("not a prime number");
		}
				
		
	}

}
