package org.example.stringPrograms;

public class RemoveLeadingZero {
    public static void main(String[] args) {
    String str = "0000230937";
    String newStr ="";
    int ind =0;

    for (int i=0;i<str.length()-1;i++){
        char p = str.charAt(i);
        if(p!='0'){
            ind=i;
            break;
        }
    }
    newStr=str.substring(ind,str.length());
        System.out.println(newStr);
    }
}
