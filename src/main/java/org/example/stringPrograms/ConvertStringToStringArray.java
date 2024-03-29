package org.example.stringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertStringToStringArray {

    public static String[] convert(Set<String> strr){
        String[] str1= new String[strr.size()];
        int index=0;

        for (String strg : strr){
            str1[index++]=strg;
        }

        return str1;
    }

    public static void main(String[] args) {
        String str ="i am Rakesh";

        Set<String> hast = new HashSet<String>(Arrays.asList(str));

        String[] newStr = convert(hast);
        System.out.println(Arrays.toString(newStr));
    }
}
