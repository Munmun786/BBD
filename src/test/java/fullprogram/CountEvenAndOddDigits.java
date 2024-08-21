package fullprogram;

import java.util.Scanner;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
	 int num = sc.nextInt();
	 int evenCount=0;
	 int oddCount = 0;
	 
	 while(num >0) {
		 
		 int rem=num%10;
		 if(rem%2 == 0 ) {
			 evenCount++;
			
		 }
		 else {
			 oddCount++;
			
		 }
		 
		 num=num/10;
		 
	 }
	
	 System.out.println("even "+ evenCount);
	 System.out.println("odd "+ oddCount);
	}

}
