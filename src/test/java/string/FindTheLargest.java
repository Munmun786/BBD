package string;

import java.util.Scanner;

public class FindTheLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the numbe a");
		int a=sc.nextInt();
		
		System.out.println("enter the numbe b");
		int b=sc.nextInt();
		
		System.out.println("enter the numbe c");
		int c=sc.nextInt();
		
//		
//		if(a>b && a>c) {
//			
//			System.out.println("largest number is "+ a);
//			
//		}else if (b>a && b>c) {
//			System.out.println("largest number is"   + b);
//		}
//		else {
//			System.out.println("largest niumbe is"+ c);
//		}
		
		
		//using ternary operartor
		
		int largest1= a>b? a:b;
		int largesr2= c>largest1 ? c:largest1;
		
		
		System.out.println(largesr2);
		
		
		
	}

}
