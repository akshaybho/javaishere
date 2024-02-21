package practice_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargeNumber {
    static Scanner sc = new Scanner(System.in);

    public static int GreatestNumber(int max) {
        List<Integer> num = new ArrayList<Integer>();
        System.out.println("enter number");
        int i;
        for (i = 0; i <= num.size(); i++) {
            num.set(i, sc.nextInt());
        }
        System.out.print(num.get(i) + " ");
        return max;
    }

    public static void main(String[] args) {
        LargeNumber l = new LargeNumber();

    }
}
