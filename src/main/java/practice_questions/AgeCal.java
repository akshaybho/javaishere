package practice_questions;

import java.time.LocalDate;
import java.time.Period;

public class AgeCal {

    public int age(){

        LocalDate a = LocalDate.now();
        LocalDate b = LocalDate.of(1995, 02, 11);
        Period year = Period.between(b, a);
        System.out.println(year+" ");

        return 0;
    }

    public static void main(String[] args) {
        AgeCal p = new AgeCal();
        p.age();
    }
}
