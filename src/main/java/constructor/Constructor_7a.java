package constructor;

public class Constructor_7a {
	
	public static void main(String[] args) {
		
		Constructor_7 a = Constructor_7.getInstance();
		Constructor_7 b = Constructor_7.getInstance();
		a.x = a.x+10;
		System.out.println("the value of a.x = "+a.x);
		System.out.println("the value of b.x = "+b.x);
		
	}

}
