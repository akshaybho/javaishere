package methods;

import java.util.Scanner;

public class Method_3 {
	
	public static float giveAverage(int a, int b, float c) {
		float avg = (a+b+c)/3;
		return avg;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		float c = sc.nextFloat();
		float avg = Method_3.giveAverage(a, b, c);
		System.out.println("The average of given numbers is = "+avg);
		sc.close();
	}

}
