package fullprogram;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "i am am mun mun";

String[] arr=str.split(" ");

Set<String> mySet=new LinkedHashSet<String>();
for(String x:arr) {
	
	mySet.add(x);
	
}

       Iterator itr = mySet.iterator();
      
       while(itr.hasNext()) {
    	   
    	   System.out.print(itr.next()+" ");
       }
	
	
	
	
	}

}
