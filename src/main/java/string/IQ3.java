package string;

public class IQ3 {
	
	public static void main(String[] args) {
		
		String str = "hello world";
		
		int []freq = new int [26];//create an array to store frequency of each letter
		
		//Loop through each character in a string
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>='a' && c<='z' ) {
				freq[c - 'a']++;
			}else if (c>='A' && c<='Z')
			{
				freq[c - 'A']++;
			}
		}
		System.out.println("Letter frequency in the string : ");
		for(int i=0;i<26;i++) {
			if(freq[i]>0) {
				System.out.println((char)('a'+i)+" : "+freq[i]);
			}
		}
	}

}
