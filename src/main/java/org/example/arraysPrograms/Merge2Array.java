package org.example.arraysPrograms;

import java.util.Arrays;

public class Merge2Array {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7};

        int a=arr1.length;
        int b=arr2.length;

        int[] arr3 = new int[a+b];

        for (int i=0;i<a;i++)
            arr3[i]=arr1[i];

        for (int i=0;i<b;i++)
            arr3[a+i]=arr2[i];

        System.out.println(Arrays.toString(arr3));
    }

}
