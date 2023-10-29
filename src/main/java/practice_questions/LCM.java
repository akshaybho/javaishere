package practice_questions;


import java.util.Scanner;

public class LCM {

    public static int findGCD(int a, int b){
        if(b == 0){
            return a;
        }
        else{

            return findGCD(b,a%b);
        }
    }
    public static int findLCM(int a, int b){
        return(a*b)/findGCD(a ,b);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();

        int lcm = findLCM(n1, n2);
        System.out.println("LCM of "+n1+" and "+n2+" = "+lcm);

    }
}
