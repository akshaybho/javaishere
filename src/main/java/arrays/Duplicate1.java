package arrays;

import java.util.HashSet;
import java.util.Set;

public class Duplicate1 {
     
	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,2,3,4,56,2,1,3};
	
		Set <Integer> seen = new HashSet<>();
		Set <Integer> dupli = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(seen.contains(arr[i])) {
				dupli.add(arr[i]);
			}
			else {
				seen.add(arr[i]);
			}
		}System.out.println("duplicate = "+dupli);
	}
}
