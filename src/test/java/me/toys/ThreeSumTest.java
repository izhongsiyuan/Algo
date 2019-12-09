package me.toys;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTest {
    @Test
    public void testThreeSum() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> expects = new ArrayList<>();
        expects.add(Arrays.asList(-1, 0, 1));
        expects.add(Arrays.asList(-1, -1, 2));
        Assert.assertEquals(expects, threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
