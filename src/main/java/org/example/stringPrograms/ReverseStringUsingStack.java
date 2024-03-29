package org.example.stringPrograms;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static String reverseUsingStack(String strr){
        char[] rev = new char[strr.length()];
        Stack<Character> stk = new Stack<Character>();
        for (int i=0; i<strr.length();i++){
            stk.push(strr.charAt(i));
        }
        int i=0;
        while (!stk.isEmpty()){
            rev[i++]=stk.pop();
        }
        return new String(rev);
    }

    public static void main(String[] args) {
        String str = "Rakesh";
        System.out.println(reverseUsingStack(str));

    }
}
