package practice_questions;

import java.util.HashSet;
import java.util.Set;

public class String_5 {
    public static void main(String[] args) {
        String s = "akshaybhogale";
        char []c = s.toCharArray();
       Set <Character> seen = new HashSet<Character>();
       Set <Character> repe = new HashSet<Character>();
        for(int i=0;i<c.length;i++){
            if(seen.contains(c[i])){
                repe.add(c[i]);
            }
            else{
                seen.add(c[i]);
            }
        }
        System.out.println(repe+" ");
            }
}


