package org.example.stringPrograms;

public class InsertstringInAnotherString {
    public static void main(String[] args) {
        String original = "i Rakesh";
        String insertString = "am ";
        int index = 2;

        String newStr = original.substring(0,index)+insertString+original.substring(index);
        System.out.println(newStr);
    }
}
