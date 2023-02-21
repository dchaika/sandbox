package com.dc.hr.challenges.advanced;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPalindromeIndex {

    @Test
    void testCase1() {
        Assertions.assertEquals(1, PalindromeIndex.palindromeIndex("quyjjdcgsvvsgcdjjyq"));
    }

    @Test
    void testCase2() {
        Assertions.assertEquals(-1, PalindromeIndex.palindromeIndex("wykkttfghdvbyxbxefnltpnbdkkdbnptlnfexbxybvdhgfttkkyw"));
    }

    @Test
    void testCase3() {
        Assertions.assertEquals(20, PalindromeIndex.palindromeIndex("qaaiyrpadovfjrmgkildtkseysejdtrpltptujlxxljutptlprtdjesyeskdlikgmrjfvodapryiaaq"));
    }

    @Test
    void testCase4() {
        Assertions.assertEquals(29, PalindromeIndex.palindromeIndex("nvwcfhsokvvellcpukdtanwihbnxsfpognmlsvejhafnnnnfahjevslmngopsxnbhiwnatdkupcllevvkoshfcwvn"));
        Assertions.assertEquals(-1, PalindromeIndex.palindromeIndex("qiuexowegcorhpcxyocgwxelirlobtercyxaowguyvoovyugwoaxycretbolrilexwgcoyxcphrocgewoxeuiq"));
    }
    @Test
    void testCase11() {
        Assertions.assertEquals(44, PalindromeIndex.palindromeIndex("hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh"));
    }

    @Test
    void customTest1() {
        Assertions.assertEquals(-1, PalindromeIndex.palindromeIndex("aa"));
        Assertions.assertEquals(0, PalindromeIndex.palindromeIndex("Waa"));
        Assertions.assertEquals(2, PalindromeIndex.palindromeIndex("aaW"));
    }

    @Test
    void customTest2() {
        Assertions.assertEquals(-1, PalindromeIndex.palindromeIndex("aaa"));
        Assertions.assertEquals(0, PalindromeIndex.palindromeIndex("Waaa"));
        Assertions.assertEquals(3, PalindromeIndex.palindromeIndex("aaaW"));
    }

    @Test
    void customTest3() {
        Assertions.assertEquals(-1, PalindromeIndex.palindromeIndex("aca"));
        Assertions.assertEquals(0, PalindromeIndex.palindromeIndex("Waca"));
        Assertions.assertEquals(1, PalindromeIndex.palindromeIndex("aWca"));
        Assertions.assertEquals(3, PalindromeIndex.palindromeIndex("acaW"));
    }

    @Test
    void customTest4() {
        Assertions.assertEquals(-1, PalindromeIndex.palindromeIndex("aaaa"));
        Assertions.assertEquals(0, PalindromeIndex.palindromeIndex("Waaaa"));
        Assertions.assertEquals(1, PalindromeIndex.palindromeIndex("aWaaa"));
        Assertions.assertEquals(3, PalindromeIndex.palindromeIndex("aaaWa"));
        Assertions.assertEquals(4, PalindromeIndex.palindromeIndex("aaaaW"));
    }

    @Test
    void customTest5() {
        Assertions.assertEquals(-1, PalindromeIndex.palindromeIndex("acca"));
        Assertions.assertEquals(0, PalindromeIndex.palindromeIndex("Wacca"));
        Assertions.assertEquals(1, PalindromeIndex.palindromeIndex("aWcca"));
        Assertions.assertEquals(3, PalindromeIndex.palindromeIndex("accWa"));
        Assertions.assertEquals(4, PalindromeIndex.palindromeIndex("accaW"));
    }

    @Test
    void customTest6() {
        Assertions.assertEquals(-1, PalindromeIndex.palindromeIndex("aaaaa"));
        Assertions.assertEquals(0, PalindromeIndex.palindromeIndex("Waaaaa"));
        Assertions.assertEquals(1, PalindromeIndex.palindromeIndex("aWaaaa"));
        Assertions.assertEquals(2, PalindromeIndex.palindromeIndex("aaWaaa"));
        Assertions.assertEquals(4, PalindromeIndex.palindromeIndex("aaaaWa"));
        Assertions.assertEquals(5, PalindromeIndex.palindromeIndex("aaaaaW"));
    }

    @Test
    void customTest7() {
        Assertions.assertEquals(-1, PalindromeIndex.palindromeIndex("accca"));
        Assertions.assertEquals(0, PalindromeIndex.palindromeIndex("Waccca"));
        Assertions.assertEquals(1, PalindromeIndex.palindromeIndex("aWccca"));
        Assertions.assertEquals(2, PalindromeIndex.palindromeIndex("acWcca"));
        Assertions.assertEquals(4, PalindromeIndex.palindromeIndex("acccWa"));
        Assertions.assertEquals(5, PalindromeIndex.palindromeIndex("acccaW"));
    }

    @Test
    void customTest8() {
        Assertions.assertEquals(-1, PalindromeIndex.palindromeIndex("acaca"));
        Assertions.assertEquals(0, PalindromeIndex.palindromeIndex("Wacaca"));
        Assertions.assertEquals(1, PalindromeIndex.palindromeIndex("aWcaca"));
        Assertions.assertEquals(2, PalindromeIndex.palindromeIndex("acWaca"));
        Assertions.assertEquals(4, PalindromeIndex.palindromeIndex("acacWa"));
        Assertions.assertEquals(5, PalindromeIndex.palindromeIndex("acacaW"));
    }
}
