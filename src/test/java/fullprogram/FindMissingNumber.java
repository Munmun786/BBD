package fullprogram;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,4,5};
		int sum1=0;
		
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("sum1 "+ sum1);
		int sum2=0;
		for(int i=1;i<=9;i++) {
			sum2=sum2+i;
		}
		System.out.println("sum2 "+2);
	
	System.out.println("missing number is "+(sum2-sum1));
	
	}

}
