package practice_questions;

import java.util.Scanner;

public class Multiple10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        while((n%10!=0) && n>0){
            System.out.println(n);
            break;
        }
    }
}
