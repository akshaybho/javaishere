package practice_questions;

import java.util.Scanner;

public class AutomorphicNumber {

   public static void isAutomorphic(int n) {

       int square = n * n;
       while (n > 0) {
           if (n % 10 != square % 10) {
               System.out.println("It is not an Automorphic");

               return;
           }
           n = n / 10;
           square = square / 10;

       }
       System.out.println("It is an Automorphic");

   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int m = sc.nextInt();
         isAutomorphic(m);

    }
}
