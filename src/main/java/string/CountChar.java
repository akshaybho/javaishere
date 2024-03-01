package string;

public class CountChar {
	public static void main(String[] args) {
		
		String ak = "India is my country";
		int count =0;
		
		
		for(int i=0;i<ak.length();i++) {
			if(ak.charAt(i)!=' ') {
				count = count+1;
			}
		}
		System.out.println("total="+count);
	}

}
