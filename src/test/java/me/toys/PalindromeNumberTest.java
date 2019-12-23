package me.toys;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {
    @Test
    public void testPalindromeNumber() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
//        Assert.assertEquals(true, palindromeNumber.palindromeNumber(121));
        Assert.assertEquals(false, palindromeNumber.palindromeNumber(-121));
    }
}
