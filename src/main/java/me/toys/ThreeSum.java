package me.toys;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. sort the array, then loop the array, when we get the value of current element, we can calculate the target sum that
// we need to find from the rest of elements, so the problem can be simplified to two sum
// 2. for the two sum question, we can set two pointers, one is at the start of the array and the other is at the end of
// the array, then we check the sum of pointed elements, 2.1 -> if sum is smaller than target, than move the front
// pointer to the next element; 2.2 -> if the sum is larger than the target, than move the behind pointer to the
// previous element
// 3. end loop until the two pointer meets, and record all the results
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outputs = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++) {
            int smallIndex = 0;
            int largeIndex = nums.length - 1;
            int target = 0 - nums[i];
            int[] newNums = nums.
            while (smallIndex != largeIndex) {
                if (nums[smallIndex] + nums[largeIndex] < target) {
                    smallIndex += 1;
                    if (smallIndex == i) {
                        smallIndex += 1;
                    }
                } else if (nums[smallIndex] + nums[largeIndex] > target) {
                    largeIndex -= 1;
                    if (largeIndex == i) {
                        largeIndex -= 1;
                    }
                } else {
                    outputs.add(Arrays.asList(nums[smallIndex], nums[largeIndex], nums[i]));
                }
            }
        }
        return outputs;
    }
}
