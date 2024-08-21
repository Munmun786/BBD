package string;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		int n1=0; int n2= 1; int sum = 0;
		System.out.print(n1+ " "+ n2 );
		
		for(int i =2; i < num;i++) {
			
			sum=n1+n2;
			System.out.print("num"   +sum);
			n1=n2;
			n2=sum;
			
		}
		
		
	}

}
