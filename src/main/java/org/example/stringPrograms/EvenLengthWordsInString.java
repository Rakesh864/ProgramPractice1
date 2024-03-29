package org.example.stringPrograms;

public class EvenLengthWordsInString {
    public static void  findEvenWords(String strr){
        for (String word : strr.split(" ")){
            if(word.length() % 2 == 0)
                System.out.println(word);
        }
    }
    public static void main(String[] args) {
        String str = "I am Rakesh";
        findEvenWords(str);

    }
}
