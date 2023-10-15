package practice_questions;

import java.util.Arrays;

public class String_2 {

    public void anagram() {
        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
        } else {

            Arrays.sort(a);
            Arrays.sort(b);
            if (Arrays.equals(a, b)) {
                System.out.println("Strings are in Anagram");
            } else {
                System.out.println("String are not in Anagram");
            }
        }
    }

    public static void main(String[] args) {
        String_2 c = new String_2();
        c.anagram();
    }
}
