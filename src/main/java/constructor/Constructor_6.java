package constructor;

public class Constructor_6 {
	
	//Block to be executed before every constructor
	// we can create any number of such blocks in same class
	{
		System.out.println("init block");
	}
	
	Constructor_6(){
		System.out.println("first constructor");
	}
    Constructor_6(int b){
    	System.out.println("second constructor");
    }
    public static void main(String[] args) {
		new Constructor_6();
		new Constructor_6(7);
	}
}
