package practice_questions;

public class ReverseArray {


    public void rev(int []a){
        int []c = new int[a.length];

        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
           c[i] = a[i];
        }
        for(int j=0;j<c.length;j++){
            System.out.print(c[j]+" ");
        }
    }

    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        r.rev(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }
}
