package practice_questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayDuplicate {
    public void dupl(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Take input from user");
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Print the elements of an array");
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
            Set<Integer> seen = new HashSet <Integer>();
            Set<Integer> dupli = new HashSet<Integer>();

            for(int k=0; k<a.length; k++){
                if(seen.contains(a[k])){
                    dupli.add(a[k]);
                }
                else{
                    seen.add(a[k]);
                }
            }
            System.out.print("The Duplicate Numbers are = "+dupli+" ");
    }
    public static void main(String[] args) {
        ArrayDuplicate ad = new ArrayDuplicate();
        ad.dupl();
    }
}
