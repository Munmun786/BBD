package array;

public class MinAndMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,5,6,3,62,9};
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max)
				
				max=a[i];
			
		}
		System.out.println("max valu"+ max);
		
		int min=a[0];

		for(int i=1;i<a.length;i++) {
			
			if(a[i]<min)
				
				min=a[i];
			
		}
		System.out.println("min valu"+ min);
		
	}

}
