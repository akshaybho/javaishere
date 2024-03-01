package string;

public class DuplicateChar {
	
	public String dupli(String s) {
		char[] c = s.toCharArray();
		for(int i=0;i<=c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					System.out.print(c[j]+" ");
				}
			}
			
		}
		return s;
	}
	public static void main(String[] args) {
		DuplicateChar d = new DuplicateChar();
		d.dupli("akksshyalmjlm");
		
	}

}
