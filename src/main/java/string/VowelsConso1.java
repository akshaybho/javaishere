package string;

import java.util.Scanner;

public class VowelsConso1 {
	
	public String find(String s) {
		int vcount = 0, ccount =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		 s = sc.nextLine();
		char []d = s.toCharArray();
		for(char c : d) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vcount++;
			break;
			default:
				ccount++;
				
			}
			
			
		}System.out.println("vowels = "+vcount);
		System.out.println("consonants = "+ccount);
		sc.close();
		return s;
		
	}
	public static void main(String[] args) {
		VowelsConso1 b = new VowelsConso1();
		b.find("ak");
		
	}

}
