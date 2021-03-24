package com.example.tutorials.programs;

public class StringReverse {

    /**
     * Implement a program to reverse the sentence of the given statement word by word and then reverse.
     * Example Input: Hello
     * Output: olleH
     *
     * */
    public static void main(String[] args) {

        System.out.println(reverseStringUsingStringBuilder("Hello"));
        System.out.println(reverseStringNormal("Hello"));
        System.out.println(reverseString("Hello"));
    }
    /**
     * takes String param to process
     * it is a bad practice for taking help of string class object doing the operation in this way
     * this process makes so many objects and garbage collected
     * */
    private static String reverseString(String str) {
        String str1 = "";
        for (int i = str.length() -1 ; i >= 0 ; i--) {
            str1 = str1 + str.charAt(i);
        }
        return str1;
    }
    /**
     * takes String param to process
     * this method process each character from the string and append to string builder
     * to avoid multiple objects creation
     * */
    private static String reverseStringNormal(String str) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = str.length() -1 ; i >= 0 ; i--) {
            strBuilder.append(str.charAt(i));
        }
        return strBuilder.toString();
    }


    /**
     * takes String param to process
     * this method is uses string builder inbuilt method to reverse the string
     * */
    private static String reverseStringUsingStringBuilder(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }
}
