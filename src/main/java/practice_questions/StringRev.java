package practice_questions;

public class StringRev {
    String revs = "";
    public String rev(String s){
        for (int i=s.length()-1;i>=0;i--){
            revs = revs + s.charAt(i);
        }
        System.out.println("Reverse is "+revs);
        return revs;
    }

    public static void main(String[] args) {
        StringRev sr = new StringRev();
        sr.rev("dogs are loyal");
    }
}
