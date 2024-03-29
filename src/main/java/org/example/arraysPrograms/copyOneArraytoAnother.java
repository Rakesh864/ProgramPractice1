package org.example.arraysPrograms;

import java.util.Arrays;

public class copyOneArraytoAnother {
    public static void main(String[] args) {

    int arr[] ={1,2,3};
    int b[] = new int[arr.length];

    //b=arr;

    for (int i=0;i<arr.length;i++){
        b[i]=arr[i];
    }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(b));
    }

}
