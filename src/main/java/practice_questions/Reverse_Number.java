package practice_questions;

public class Reverse_Number {

    public int reverse(int a){
   int rev=0;
         while(a>0){
             int b = a%10;
              rev = rev*10 + b;
              a = a/10;

         }return rev;

    }

    public static void main(String[] args) {

        Reverse_Number m = new Reverse_Number();
        int rev = m.reverse(1234);

        System.out.println(rev);
    }
}
