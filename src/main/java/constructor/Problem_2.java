package constructor;


/*Write a program to print the names of students by creating a Student class. 
 * If no name is passed while creating an object of Student class,
 *  then the name should be "Unknown", otherwise the name should be equal 
 *  to the String value passed while creating object of Student class.
 */
public class Problem_2 {
    String name;
	public Problem_2(String s) {
		name = s;
	}
	public Problem_2() {
		name = "unknown";
	}
	public static void main(String[] args) {
		Problem_2 a = new Problem_2("akshay");
		Problem_2 b = new Problem_2();
		
		System.out.println("The student name is "+a.name);
		System.out.println("The student name is "+b.name);
	}
}
