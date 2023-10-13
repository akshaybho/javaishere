package practice_questions;

import java.util.Scanner;

public class AvgArray {
    public int[] avg(int []a){
        int sum = 0;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of an array");
        int n = sc.nextInt();
        int []b = new int[10];
        System.out.println("Taking values from user");
        for(int i=0; i<b.length;i++){
            b[i] = sc.nextInt();
        }
        for(int i=0; i<b.length;i++){
            sum = sum + b[i];
        }
        avg = (sum/b.length);
        System.out.println("Average is = "+avg);
        return a;
    }

    public static void main(String[] args) {
        AvgArray g = new AvgArray();
        g.avg(new int[]{1, 2, 3});
    }
}
