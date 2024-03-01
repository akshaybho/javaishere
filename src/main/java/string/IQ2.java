package string;

public class IQ2 {
	public static void main(String[] args) {
		
		String str = "Samuel has 3 dogs and he goes to walk with them at 5 in the morning";
		
		String[] words = str.split("\\s+");
		
		for(String word : words) {
			try {
				int num = Integer.parseInt(word);
				System.out.println(num);
			}
			catch(NumberFormatException e){
				
			}
		}
	}

}
// "\\s+"- to split any amount of whitespace
