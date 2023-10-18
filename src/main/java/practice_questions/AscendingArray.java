package practice_questions;

import java.util.Scanner;

public class AscendingArray {
    public int[] asc(){
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int n = sc.nextInt();
        int []a = new int[n];
        System.out.println("enter the numbers");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("print the array");
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();
        System.out.println("Arrange an array in ascending order");
        for(int k =0;k<a.length;k++){
            for(int l=k+1;l<a.length;l++){
                if(a[k]>a[l]){
                    temp = a[k];
                    a[k] = a[l];
                    a[l] = temp;
                }
                }
        }
        for(int x=0;x<a.length;x++){
            System.out.print(a[x]+" ");
        }return a;
    }
    public static void main(String[] args) {
        AscendingArray m = new AscendingArray();
        m.asc();
    }
}
