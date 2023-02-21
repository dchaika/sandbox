package com.dc.hr.challenges.advanced;

public class PalindromeIndex {

    /*
     * Given a string of lowercase letters in the range ascii[a-z],
     * determine the index of a character that can be removed to make the string a palindrome https://en.wikipedia.org/wiki/Palindrome.
     * There may be more than one solution, but any will do.
     * If the word is already a palindrome or there is no solution, return -1.
     * Otherwise, return the index of a character to remove.
     *
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
        if (s.length() == 1) {
            return -1;
        }
        if (s.length() == 2) {
            return s.toCharArray()[0] == s.toCharArray()[1] ? -1 : 0;
        }
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            return -1;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                StringBuilder s1 = new StringBuilder(s.substring(0, i) + s.substring((i + 1)));
                StringBuilder s2 = new StringBuilder(s.substring(0, (s.length() - 1 - i)) + s.substring((s.length() - 1 - i) + 1));
                if (s1.toString().equals(s1.reverse().toString())) {
                    return i;
                }
                if (s2.toString().equals(s2.reverse().toString())) {
                    return s.length() - 1 - i;
                }
            }
        }
        return s.length() - 1;
    }
}