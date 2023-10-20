package practice_questions;

public class Fibonacci {
    public int fibo(int b){
        int sum = 0;
        int temp = 1;
        System.out.print(sum+" "+temp+" ");
        for(int i=0;i<10;i++){
            b = sum + temp;
            sum = temp;
            temp = b;
            System.out.print(" "+b+" ");
        }


    return b;
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fibo(0);
    }
}
