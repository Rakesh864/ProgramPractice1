package org.example.arraysPrograms;

import java.util.Arrays;

public class arraysBubbelSort {

    public static int[] bubbleSort(int[] array){
        int n = array.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int arr[]={5,3,6,8,2,6,1};

        System.out.println(Arrays.toString(bubbleSort(arr)));


    }
}
