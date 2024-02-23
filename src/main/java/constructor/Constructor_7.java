package constructor;

public class Constructor_7 {
	
	/*What is a Singleton class?

As the name implies, a class is said to be singleton
 if it limits the number of objects of that class to one.
We can’t have more than a single object for such classes.*/
	static Constructor_7 instance = null;
	int x = 10;
	
	private Constructor_7() {
		
	}
	
	static public Constructor_7 getInstance() {
		if(instance == null) {
			instance = new Constructor_7();
		}
		return instance;
	}

}
