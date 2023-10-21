package practice_questions;

public class CountWords {

    public static int count(String s, int count1){

        char []c = s.toCharArray();
        for (int i=0;i<c.length-1;i++){
            if(c[i]!=' ' && c[i+1]==' '){
                count1++;
            }
        }
        System.out.println();
    return count1;
    }

    public static void main(String[] args) {

        int r = count("i am excited to give interviews", 1);
        System.out.println("Total number of words are = "+r);
    }
}
