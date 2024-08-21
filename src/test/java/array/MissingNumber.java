package array;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,5,6,7};
		int sum1=0;
		
		for(int i=0;i<=a.length-1;i++) {
			sum1=sum1+a[i];
			
		}
		System.out.println("sum of sum1"+sum1);
		
		int sum2=0;
		
		for(int i=1;i<=7;i++) {
			sum2=sum2+i;
		}
		
		
		System.out.println("missing number is"+(sum2-sum1));
	}

}
