package fullprogram;

import java.util.HashMap;
import java.util.Map;

public class CountWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "i am munu am prdhan munu";
		Map<String, Integer> map=new HashMap<String,Integer>();
		Integer countInteger=1;
		String[] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], countInteger);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for(String x: map.keySet()) {
			System.out.println("the count of word is "+x+" = "+ map.get(x));
		}
		
		
	}

}
