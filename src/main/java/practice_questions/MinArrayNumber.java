package practice_questions;

public class MinArrayNumber {

    public static int min(int []a)
    {
        int min = a[0];
        for(int i=1; i<a.length; i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int []b = {47,23,28,12,85,64,61};
        int minimum  = MinArrayNumber.min(b);
        System.out.println("The minimum number is = "+minimum);
    }
}
