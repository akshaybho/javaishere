package lambda;

public class Lambda2Addable {
	
	public static void main(String[] args) {
		
		Addable ad1 = (a, b)->(a+b);
		System.out.println(ad1.add(100, 200));
		
		Addable ad2 = (a, b)->(a+b);
		System.out.println(ad2.add(300, 400));
	}

}
