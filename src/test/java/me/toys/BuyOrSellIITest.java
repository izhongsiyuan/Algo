package me.toys;

import org.junit.Assert;
import org.junit.Test;

public class BuyOrSellIITest {
    @Test
    public void testBuyOrSellII() {
        BuyOrSellII buyOrSellII = new BuyOrSellII();
        Assert.assertEquals(4, buyOrSellII.buyOrSell(new int[] {1,2,3,4,5}));
    }
}
