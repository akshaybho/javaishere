package methods;

import java.util.Scanner;

public class Method_2 {
	
	public static int sumOfNumbers(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("input values");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int sum = Method_2.sumOfNumbers(a, b);
		 System.out.println("sum of two number is = "+sum);
		 sc.close();
	}

}
