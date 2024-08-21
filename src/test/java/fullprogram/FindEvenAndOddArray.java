package fullprogram;

public class FindEvenAndOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,3,4,5,7,8,9};
		System.out.println("even number");
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		
		System.out.println("odd number");
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
	}

}
