package org.example.arraysPrograms;

import java.util.Arrays;

public class Check2ArrayEqualorNot {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        //boolean isEqual = Arrays.equals(a,b);
        boolean isEqual=true;

        if(a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                    if (a[i] != b[i]) {
                        isEqual = false;
                        break;
                }
            }
        }
        if (isEqual)
            System.out.println("Equal");
        else
            System.out.println("not equal");
    }
}
