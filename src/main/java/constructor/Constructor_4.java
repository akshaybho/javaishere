package constructor;

public class Constructor_4 {
	
	//Constructor Chaining by this keyword
	Constructor_4(){
		
		this(5);
		System.out.println("This is default constructor");
	}
	Constructor_4(int x){
		
		this(6, 8);
		System.out.println(x);
		System.out.println("Second Constructor");
	}
	Constructor_4(int a, int b){
		
		System.out.println(a*b);
		System.out.println("Third Constructor");
	}
	public static void main(String[] args) {
		new Constructor_4();
	}

}
