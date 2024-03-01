package methods;

import java.util.Scanner;

public class Method_4 {
	
	public static int sumOfOdd(int n) {
		int sum =0;
		for(int i=1;i<=n;i++) {
			if((i%2)!=0) {
				sum = i +sum;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take input from user");
		int n = sc.nextInt();
		int sum = Method_4.sumOfOdd(n);
		System.out.println("The sum of odd numbers is = "+sum);
		sc.close();
	}

}
