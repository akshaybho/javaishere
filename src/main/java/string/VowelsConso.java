package string;

import java.util.Scanner;

public class VowelsConso {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s= sc.nextLine();
		int vcount = 0, ccount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vcount++;
			}else if(s.charAt(i)!=' ') {
				ccount++;
			}

		}
		System.out.println("Vowels="+vcount+"\n"+"Consonants="+ccount);
		sc.close();
	}

}
