package methods;

import java.util.Scanner;

public class Method_5 {
	
	public static int greaterNumber(int a, int b) {
		int greater;
		if(a<b) {
			 greater =b;
			System.out.println(greater+" is grater than "+a);
		}
		else {
			 greater =a;
			System.out.println(greater+" is grater than "+b);
		}
		return greater;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("take the input from user");
		int a = sc.nextInt();
		int b = sc.nextInt();
		 Method_5.greaterNumber(a, b);		
		sc.close();
	}

}
