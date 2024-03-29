package org.example.arraysPrograms;

import java.util.Arrays;

public class RemoveDuplicate {

    public  static int[] sortArray(int[] array){
        int n = array.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static int[] removeDuplicate(int[] arr1){
        int n =arr1.length;
        int j=0;
        for (int i=0;i<n-1;i++){
            if(arr1[i]!=arr1[i+1])
                arr1[j++]=arr1[i];
        }
        arr1[j++]=arr1[n-1];
        int[] arr2 = new int[6];
        for (int i=0;i<j;i++){
            arr2[i]=arr1[i];
        }
        return arr2;
    }
    public static void main(String[] args) {
        int[] arr ={1,3,4,6,3,4,2,5};
        arr= sortArray(arr);
        System.out.println(Arrays.toString(arr));

        arr=removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));


    }
}
