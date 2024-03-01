package methods;

import java.util.Scanner;

public class Method_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take input from user");
        String m = sc.next();
        String reverse = Method_6.revString(m);
        System.out.println("REVERSE IS = "+reverse);
    }

    public static String revString(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        return rev;
    }
}
