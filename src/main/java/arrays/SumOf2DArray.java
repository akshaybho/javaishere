package arrays;

import java.util.Scanner;

public class SumOf2DArray {

    public static void main(String[] args) {

        int [][]a = new int[2][3];

        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;

        int sum = 0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                sum = sum + a[i][j];
            }
        }
        System.out.println("The sum is = "+sum);

    }

}
