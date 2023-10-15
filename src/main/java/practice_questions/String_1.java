package practice_questions;

public class String_1 {

    public String position(String s){

        int index1 = s.charAt(0);
        int index2 = s.charAt(10);

        System.out.println("The position of charatcter at 0th position = "+(char)index1);
        System.out.println("The position of charatcter at 10th position = "+(char)index2);

        return s;
    }

    public static void main(String[] args) {

        String_1 v = new String_1();
        //v.position("animals are very good");
        String str = v.position("animals are very good");
        System.out.println(str);
    }

}
