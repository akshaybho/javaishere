package practice_questions;

import java.util.Scanner;

public class ArmstrongNumber {
    int d =0;
    public void arm(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        int h =n;
        while(n>0){
            int a = n%10;
            int b = 0*a +a;
            d = d + (b*b*b);
            n = n/10;
        }

        if(h==d){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong");
        }

    }

    public static void main(String[] args) {
        ArmstrongNumber an = new ArmstrongNumber();
        an.arm();


    }
}
