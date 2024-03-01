package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
	 public static void main(String[] args) {
	        
	        List <Integer> numbers = new ArrayList <Integer>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.forEach((n)->{System.out.println(n);});
	    }

}
