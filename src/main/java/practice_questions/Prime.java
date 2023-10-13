package practice_questions;

import java.util.Scanner;

public class Prime {
    public void prime(){
        //int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number upto which you required prime numbers");
        int n = sc.nextInt();
        for(int i=2; i<=n; i++) {
           int count = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {

                System.out.print(i + " ");
        }
        }
        }
        public static void main(String[] args) {
        Prime p = new Prime();
        p.prime();
    }
}
