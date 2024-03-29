package org.example.arraysPrograms;

public class LargestElementInArray {

    public static int largestElement(int[] array){
        int l = 0;
        for (int i=0;i<array.length;i++){
                if(array[i]>l)
                    l=array[i];
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,6,2,56,2};
        System.out.println(largestElement(arr));
    }
}
