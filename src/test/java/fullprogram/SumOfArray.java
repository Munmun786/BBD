package fullprogram;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,3,4,6};
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++) {
			
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}

}
