package constructor;

public class Constructor_3 {
	
	//Copy Constructor in Java
	/* Unlike other constructors copy constructor is passed with another object
	  which copies the data available from the passed object to the newly created object.
	 */
	String name; 
	int id;
	
	Constructor_3(String name, int id){
		this.name = name;
		this.id = id;
		
	}
	Constructor_3(Constructor_3 obj2){
		this.name = obj2.name;
		this.id = obj2.id;
	}
	/*In Java, this is a reference variable that refers to the current object on which 
	  the method or constructor is being invoked. It can be used to access instance 
	  variables and methods of the current object.
	 */
    public static void main(String[] args) {
		
    	System.out.println("First Object");
    	Constructor_3 c = new Constructor_3("Akshay", 29);
    	System.out.println("Student name :"+c.name+" and id:"+c.id);
    	System.out.println();
    	
    	Constructor_3 d = new Constructor_3(c);
    	System.out.println("Student name:"+d.name+" and id:"+d.id);
	}
	
}
