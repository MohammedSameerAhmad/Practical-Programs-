package com.example.tutorials.programs.strings;

public class PalindromeStrings {

    /**
     * Given a string str, the task is to find whether the
     * string is a palindrome or not in Java without using library methods.
     *
     * Input: str = “abba”
     * Output: Yes
     *
     * Input: str = “abbaba”
     * Output: No
     * */
    public static void main(String[] args) {
        String str1= "abba";
        String str2 = "abcba";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }

    static boolean isPalindrome(String str)
    {

        // Pointers pointing to the beginning and the end of the string
        int firstPointer = 0;
        int lastPointer = str.length() - 1;

        // While there are characters to compare
        while (firstPointer < lastPointer) {

            // If there is a mismatch
            if (str.charAt(firstPointer) != str.charAt(lastPointer))
                return false;

            // Increment first pointer and decrement the other
            firstPointer++;
            lastPointer--;
        }
        return true;
    }
}
