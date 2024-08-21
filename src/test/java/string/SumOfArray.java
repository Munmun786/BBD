package string;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {20,34,21,32};
		int sum = 0 ;
//		
//		for(int i = 0; i<= a.length-1;i++) {
//			
//			sum=sum+a[i];
//		}
		
		
		for(int value :a) {
			sum= sum+value;
			
		}
		
		System.out.println(sum);
	}

}
