package fullprogram;

import java.util.Arrays;

import org.checkerframework.checker.units.qual.s;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="munu";
		String s2= "unu";
		
		char[] arr1=s1.toLowerCase().toCharArray();
		char[] arr2=s2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
		
		
		
	}

}
