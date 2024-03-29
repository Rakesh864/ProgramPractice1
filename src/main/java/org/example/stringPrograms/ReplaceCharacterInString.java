package org.example.stringPrograms;

public class ReplaceCharacterInString {
    public static void main(String[] args) {
        String str="Welcome fo my world";
        char ch = 't';
        int index=8;

        String strr = str.substring(0,index)+ch+str.substring(index+1);
        System.out.println(strr);

        StringBuffer sb = new StringBuffer(str);
        sb.setCharAt(index,ch);
        System.out.println(sb);
    }
}
