package practice_questions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FourthLargest {
    public void desiredNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Take size of an Array");
        int n = sc.nextInt();
        int []a = new int[n];
        System.out.println("Take input from user");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Print an Array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            int temp;
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0; i<a.length;i++){
            if(i == 3){
                System.out.println("4th largest is "+a[i]);
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        FourthLargest f = new FourthLargest();
        f.desiredNumber();
    }
}
