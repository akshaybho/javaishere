package practice_questions;

public class String_6{
    int count =0;
    public char[] repeated(String s) {

        char[] c = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                if (c[i] == c[j]) {
                   count++;
                    if(count>1){
                        System.out.println(c[i]+" ");
                }

                }
            }
        }
    return c;}

    public static void main(String[] args) {
        String_6 d = new String_6();
        d.repeated("akshay");
    }
}
