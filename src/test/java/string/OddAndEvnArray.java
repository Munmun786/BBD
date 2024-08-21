package string;

public class OddAndEvnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7};
		
		System.out.println("even numbwer in array");
		
		for(int i =0; i<=a.length-1;i++) {
			
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		
System.out.println("odd numbwer in array");
		
		for(int i =0; i<=a.length-1;i++) {
			
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		
		
	}

}
