package org.example.stringPrograms;

public class GetCharFromString {
    public static char getChar(String strr,int index){
        return strr.charAt(index);
    }
    public static void main(String[] args) {
        String str="Rakesh";
        int index= 3;
        char ch = getChar(str,index);
        System.out.println(ch);
    }
}

