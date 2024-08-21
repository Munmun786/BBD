package fullprogram;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int sum=0;
		
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println(sum);
		
	}

}
