package org.example.stringPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String str ="Rakesh";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
          rev+=str.charAt(i);
        }
       System.out.println(rev);
    }
}
