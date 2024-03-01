package string;

public class PWCQuestion {
    
	public static void main(String[] args) {
		
		String s = "Boy is good";
		//Desired output is = Big
		String desired = "";
		String []b = s.split(" ");
		for(int i =0;i<b.length;i++) {
			desired = desired + b[i].charAt(0);
		}
		System.out.println(desired);
	}
}
