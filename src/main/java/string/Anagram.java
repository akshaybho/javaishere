package string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		String s1 = "silent";
		String s2 = "listen";
		
		s1.toLowerCase();
		s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Strings are not in anagram");
		}else {
		char[] a =s1.toCharArray();
		char[] b =s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b)) {
			System.out.println("Strings are in anagram");
		}
		else {
			System.out.println("Strings are not in anagram");
		}
	}

}}
