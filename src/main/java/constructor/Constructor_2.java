package constructor;

public class Constructor_2 {
	
	String name;
	int id;
	int age;
	
	Constructor_2(String name1, int id1, int age1){
     name = name1;
     id = id1;
     age = age1;
	}
	public void userinfo() {
		System.out.println("name of student = "+name+"\n"+"stduent id = "+id+"\n"+"age of student = "+age);
		
	}
	public static void main(String[] args) {
		
		Constructor_2 c = new Constructor_2("Akshay",8619400,28);
		Constructor_2 b = new Constructor_2("Onkar",71245,27);
		c.userinfo();
		b.userinfo();
	}

}
