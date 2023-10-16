package practice_questions;

import java.util.HashSet;
import java.util.Set;

public class String_3 {
    public void repeated(){
        String s = "aabbccaaddccbberh";

        Set<Character> seen = new HashSet<Character>();
        Set<Character> dupli = new HashSet<Character>();

        for(int i=0; i<s.length();i++){
            if(seen.contains(s.charAt(i))){
                dupli.add(s.charAt(i));
            }
            else {
                seen.add(s.charAt(i));
            }

        }
        System.out.println("The rpeated characters are "+dupli+" ");

    }

    public static void main(String[] args) {
        String_3 re = new String_3();
        re.repeated();
    }
}
