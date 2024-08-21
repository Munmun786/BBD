package fullprogram;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.hssf.record.PageBreakRecord.Break;

import java.util.Map;



public class FirstNonRepetative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String srt="munnuu";
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		Integer count=1;
		
		for(int i=0;i<srt.length();i++) {
			if(map.containsKey(srt.charAt(i))){
				map.put(srt.charAt(i), count);
			}else {
				map.put(srt.charAt(i), map.get(srt.charAt(i))+1);
			}
			
		}
		
		for(Entry<Character , Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				
				System.out.println(entry.getKey());
				break;
			}
		}
		
		
	}

}
