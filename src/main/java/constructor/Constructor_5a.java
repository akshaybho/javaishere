package constructor;

public class Constructor_5a extends Constructor_5 {
	
	Constructor_5a(){
		System.out.println("No Argument constructor of class Constructor_5a");
	}
	
	Constructor_5a(int y){
		super(7);
		System.out.println("Parameterized constructor of class Constructor_5a ");
	}
	
	public static void main(String[] args) {
		Constructor_5a g = new Constructor_5a(5);
	}

}
