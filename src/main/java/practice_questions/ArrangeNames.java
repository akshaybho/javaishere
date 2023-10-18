package practice_questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrangeNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("akshay");
        names.add("anamika");
        names.add("aakriti");
        names.add("prashant");
        names.add("mandar");
        names.add("charu");
        names.add("vishal");
        names.add("pankaj");
        names.add("abhishek");
        names.add("sunil");
        names.add("shweta");
        names.add("kajol");

        names.sort(Comparator.comparing(s->s));
        System.out.println(names);
    }
}
