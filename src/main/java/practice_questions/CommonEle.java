package practice_questions;

public class CommonEle {

    public void common(int []a, int[]b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.print(b[j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        CommonEle c = new CommonEle();
        int []d = {1,5,10,15,25};
        int []e = {5,6,9,15,1,8};
        c.common(d, e);
    }
}
