package me.toys;

// get the length of the int x
// get the last number of int x: lastNum = x % 10; delete last number (x - lastNum) / 10; length--
// get the first number of int x: firstNum = x / (length * 10); delete first number x % (length * 10); length--
// loop until the length of int x == 1 or 0; if meet firstNum != lastNum return false else return true
public class PalindromeNumber {
    public boolean palindromeNumber(int x) {
        if (x < 0) {return false;}
        int length = String.valueOf(x).length();

        while (length > 1) {
            //get lastNum, firstNum
            int lastNum = x % 10;
            int firstNum = x / (int)Math.pow(10, length - 1);
            if (lastNum != firstNum) {
                return false;
            }

            //delete lastNum
            x = (x - lastNum) / 10;
            length--;

            //delete firstNum
            x = x % (int)Math.pow(10, length - 1);
            length--;
        }
        return true;
    }
}
