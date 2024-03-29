package org.example.stringPrograms;

public class Pangram {

    public static void checkPangram(String strr){
        strr = strr.toLowerCase();
        boolean allLettersPresent=true;
        for(char ch = 'a';ch<='z';ch++){
            if(!strr.contains(String.valueOf(ch))){
                allLettersPresent=false;
                break;
            }
        }
        if(allLettersPresent){
            System.out.println("Is pangram");
        }else {
            System.out.println("Not a pangram");
        }
    }
    public static void main(String[] args) {
        String str ="Abcdefghijklmnopqrstuvwxyz";
        checkPangram(str);

    }
}
