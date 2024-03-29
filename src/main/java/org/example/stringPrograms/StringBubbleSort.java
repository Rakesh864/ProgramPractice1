package org.example.stringPrograms;

public class StringBubbleSort {

    public static String bubbleSort(String strr){
        char[] arr = strr.toCharArray();
        int n=arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str = "raju";
        System.out.println(bubbleSort(str));
    }
}
