package practice_questions;

public class ReverseAnArray {
    public void reverse(int []a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        ReverseAnArray ra = new ReverseAnArray();
        int []b = {1,2,3,4,5,6,7,8};
        ra.reverse(b);
    }
}
