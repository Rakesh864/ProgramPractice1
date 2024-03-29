package org.example.arraysPrograms;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class RemoveAllOccurance {
    public static int[] removeOccurance(int[] array , int key){
        int j=0;
        for (int i=0;i<array.length;i++){
            if(array[i]!=key)
                array[j++]=array[i];
        }
        return Arrays.copyOf(array,j);
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,2,3,5,3,9,10};
        int k =3;
        System.out.println(Arrays.toString(removeOccurance(arr,k)));

    }
}
