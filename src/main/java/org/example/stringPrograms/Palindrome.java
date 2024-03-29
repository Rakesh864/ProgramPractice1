package org.example.stringPrograms;

public class Palindrome {
    public static boolean checkPalindrome(String strr){
        String rev="";
        for (int i=strr.length()-1;i>=0;i--){
            rev+=strr.charAt(i);
        }
        if(rev.equals(strr))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String str = "ammaa";
        System.out.println(checkPalindrome(str));

    }
}
