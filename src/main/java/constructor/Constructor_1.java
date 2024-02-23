package constructor;

public class Constructor_1 {
	
	/*It is not necessary to write a constructor for a class. 
	 It is because the java compiler creates a default constructor 
	  (constructor with no arguments) if your class doesn’t have any.*/
	 
	//Constructors have the same name as that of the class
	//Constructors do not have any return type
	
	/*The first line of a constructor is a call to super() or this(), 
	  (a call to a constructor of a super-class or an overloaded constructor), 
	  if you don’t type in the call to super in your constructor the 
	  compiler will provide you with a non-argument call to super at 
	  the first line of your code, the super constructor must be called to create an object:
	 If you think your class is not a subclass it actually is, every class in Java is the subclass
	  of a class object even if you don’t say extends object in your class definition.
	*/
  private String name;
  
  Constructor_1(){
	  name = "akshay";
  }
  public void name() {
	  System.out.println("the name of the student is "+name);
  }
  public static void main(String[] args) {
	
	  Constructor_1 c = new Constructor_1();
	  c.name();
}
}
