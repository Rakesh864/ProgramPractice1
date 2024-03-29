package org.example.stringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
public class Test {
    public static void main(String[] args) {
        String str = "amma";
        String rev ="";
        for (int i=str.length()-1; i>=0;i--){
            rev+=str.charAt(i);
        }

        if(rev.equals(str)){
            System.out.println("is palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
