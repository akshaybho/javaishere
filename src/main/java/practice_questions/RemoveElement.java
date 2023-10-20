package practice_questions;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int []initial = {1,2,3,4,5,6,7,8};
        int removeElement = 7;
        int []ar1 = {12,13,14,15,16,17,18};
        int deleteElement = 14;
        int [] newArray = delete(initial, removeElement);
        int [] newArray_1 = delete(ar1, deleteElement);
        System.out.println("Original Array = "+ Arrays.toString(initial));
        System.out.println("Final Array = "+Arrays.toString(newArray));
        System.out.println("Original_1 Array = "+Arrays.toString(ar1));
        System.out.println("Final outcome = "+Arrays.toString(newArray_1));

    }
    public static int[] delete(int []array, int element){
        int []final_1 = new int[array.length - 1];
        int index = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]!= element){
                final_1[index] = array[i];
                index++;
            }
        }

    return final_1;
    }
}
