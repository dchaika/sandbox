package com.dc.hr.challenges;

public class CaesarCipher {

    /*
     * Julius Caesar protected his confidential information by encrypting it using a cipher.
     * Caesar's cipher shifts each letter by a number of letters.
     * https://en.wikipedia.org/wiki/Caesar_cipher
     * If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet.
     * In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
     *
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    private static final String alphabetL = "abcdefghijklmnopqrstuvwxyz";
    private static final String alphabetU = alphabetL.toUpperCase();
    private static final char[] alphabetCL = alphabetL.toCharArray();
    private static final char[] alphabetCU = alphabetU.toCharArray();

    public static String caesarCipher(String s, int k) {
        StringBuilder newS = new StringBuilder();
        for (char c : s.toCharArray()) {
            newS.append(substitute(c, k));
        }
        return newS.toString();
    }

    private static char substitute(char c, int k) {
        if (k > alphabetCL.length) {
            k = k % alphabetCL.length;
        }
        for (int i = 0; i < alphabetCL.length; i++) {
            if (alphabetCL[i] == c) {
                return i + k < alphabetCL.length ? alphabetCL[i + k] : alphabetCL[i + k - alphabetCL.length];
            }
        }
        for (int i = 0; i < alphabetCU.length; i++) {
            if (alphabetCU[i] == c) {
                return i + k < alphabetCU.length ? alphabetCU[i + k] : alphabetCU[i + k - alphabetCU.length];
            }
        }
        return c;
    }
}