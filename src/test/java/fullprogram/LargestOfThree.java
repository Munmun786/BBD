package fullprogram;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number a1");
		int a1=sc.nextInt();
		System.out.println("enter a number b1");
		int b1=sc.nextInt();
		System.out.println("enter a number c1");
		int c1=sc.nextInt();
		
		if(a1>b1 && a1>c1) {
			
			System.out.println("largest numbe "+ a1);
		}else if (b1>a1 && b1 > c1) {
			System.out.println("largest number " +b1);
		}else {
			System.out.println("largest number "+ c1);
		}
		
		//tenary operta
		int largest= a1>b1 ? a1:b1;
		int lrg = c1>largest ? c1:largest;
		System.out.println(lrg);
		
	}

}
