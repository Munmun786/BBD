package array;

public class LenearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40};
		int searchEl= 50;
		
		
		boolean flage=false;
		for(int i=0;i<a.length;i++) {
			if(searchEl == a[i]) {
				
				System.out.println("search value "+a[i]);
				flage=true;
				break;
			}
			
		}
		if (false==false) {
			System.out.println("elemnt not found");
		}
		
		
		
		
	}

}
