package methods;

import java.util.Scanner;

public class Method_1 {
	
	public static void printMyName(String name) {
		System.out.println("output comes");
		System.out.println(name);
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = sc.next();
		Method_1.printMyName(name);
		sc.close();
	}

}
