package string;

import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] args) {
		
		int count =1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		
		String s = sc.nextLine();
		
		for(int i =0;i<s.length()-1;i++) {
			char c,d;
			c = s.charAt(i);
			d = s.charAt(i+1);
			if(c==' ' && d!=' ') {
				count++;
			}
		}
		System.out.println("words="+count);
		sc.close();
		
		
	}

}
