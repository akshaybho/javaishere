package practice_questions;

public class RevSentence {

    public static void main(String[] args) {

        String s = "my name is akshay yaduraj bhogale";

        String desired = "";
        String []words = s.split(" ");
        for(int i=words.length-1;i>=0;i--){
            desired = desired + " "+words[i];
        }
        System.out.println(desired.trim());
    }
}
