package string;

import java.util.Scanner;

public class StringRev {
	
	public void rev() {
		
		String rev = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String ak = sc.nextLine();
		
		for(int i=ak.length()-1;i>=0;i--) {
			rev = rev + ak.charAt(i);
		}
		System.out.println("Reverse is="+rev);
		sc.close();
	}
	public static void main(String[] args) {
		
		StringRev b = new StringRev();
		b.rev();
	}

}
